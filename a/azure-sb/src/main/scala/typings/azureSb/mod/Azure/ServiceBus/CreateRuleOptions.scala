package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateRuleOptions> */
@js.native
trait CreateRuleOptions extends StObject {
  
  var correlationIdFilter: js.UndefOr[String] = js.native
  
  var falseFilter: js.UndefOr[String] = js.native
  
  var sqlExpressionFilter: js.UndefOr[String] = js.native
  
  var sqlRuleAction: js.UndefOr[String] = js.native
  
  var trueFilter: js.UndefOr[String] = js.native
}
object CreateRuleOptions {
  
  @scala.inline
  def apply(): CreateRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleOptions]
  }
  
  @scala.inline
  implicit class CreateRuleOptionsMutableBuilder[Self <: CreateRuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationIdFilter(value: String): Self = StObject.set(x, "correlationIdFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdFilterUndefined: Self = StObject.set(x, "correlationIdFilter", js.undefined)
    
    @scala.inline
    def setFalseFilter(value: String): Self = StObject.set(x, "falseFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseFilterUndefined: Self = StObject.set(x, "falseFilter", js.undefined)
    
    @scala.inline
    def setSqlExpressionFilter(value: String): Self = StObject.set(x, "sqlExpressionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlExpressionFilterUndefined: Self = StObject.set(x, "sqlExpressionFilter", js.undefined)
    
    @scala.inline
    def setSqlRuleAction(value: String): Self = StObject.set(x, "sqlRuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlRuleActionUndefined: Self = StObject.set(x, "sqlRuleAction", js.undefined)
    
    @scala.inline
    def setTrueFilter(value: String): Self = StObject.set(x, "trueFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueFilterUndefined: Self = StObject.set(x, "trueFilter", js.undefined)
  }
}
