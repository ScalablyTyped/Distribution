package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateRuleOptions> */
trait CreateRuleOptions extends StObject {
  
  var correlationIdFilter: js.UndefOr[String] = js.undefined
  
  var falseFilter: js.UndefOr[String] = js.undefined
  
  var sqlExpressionFilter: js.UndefOr[String] = js.undefined
  
  var sqlRuleAction: js.UndefOr[String] = js.undefined
  
  var trueFilter: js.UndefOr[String] = js.undefined
}
object CreateRuleOptions {
  
  inline def apply(): CreateRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleOptions]
  }
  
  extension [Self <: CreateRuleOptions](x: Self) {
    
    inline def setCorrelationIdFilter(value: String): Self = StObject.set(x, "correlationIdFilter", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdFilterUndefined: Self = StObject.set(x, "correlationIdFilter", js.undefined)
    
    inline def setFalseFilter(value: String): Self = StObject.set(x, "falseFilter", value.asInstanceOf[js.Any])
    
    inline def setFalseFilterUndefined: Self = StObject.set(x, "falseFilter", js.undefined)
    
    inline def setSqlExpressionFilter(value: String): Self = StObject.set(x, "sqlExpressionFilter", value.asInstanceOf[js.Any])
    
    inline def setSqlExpressionFilterUndefined: Self = StObject.set(x, "sqlExpressionFilter", js.undefined)
    
    inline def setSqlRuleAction(value: String): Self = StObject.set(x, "sqlRuleAction", value.asInstanceOf[js.Any])
    
    inline def setSqlRuleActionUndefined: Self = StObject.set(x, "sqlRuleAction", js.undefined)
    
    inline def setTrueFilter(value: String): Self = StObject.set(x, "trueFilter", value.asInstanceOf[js.Any])
    
    inline def setTrueFilterUndefined: Self = StObject.set(x, "trueFilter", js.undefined)
  }
}
