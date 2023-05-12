package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.OptionalProductionType
import typings.chevrotainTypes.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProdOccurrence extends StObject {
  
  var dynamicTokensEnabled: Boolean
  
  var maxLookahead: Double
  
  var prodOccurrence: Double
  
  var prodType: OptionalProductionType
  
  var rule: Rule
}
object ProdOccurrence {
  
  inline def apply(
    dynamicTokensEnabled: Boolean,
    maxLookahead: Double,
    prodOccurrence: Double,
    prodType: OptionalProductionType,
    rule: Rule
  ): ProdOccurrence = {
    val __obj = js.Dynamic.literal(dynamicTokensEnabled = dynamicTokensEnabled.asInstanceOf[js.Any], maxLookahead = maxLookahead.asInstanceOf[js.Any], prodOccurrence = prodOccurrence.asInstanceOf[js.Any], prodType = prodType.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProdOccurrence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProdOccurrence] (val x: Self) extends AnyVal {
    
    inline def setDynamicTokensEnabled(value: Boolean): Self = StObject.set(x, "dynamicTokensEnabled", value.asInstanceOf[js.Any])
    
    inline def setMaxLookahead(value: Double): Self = StObject.set(x, "maxLookahead", value.asInstanceOf[js.Any])
    
    inline def setProdOccurrence(value: Double): Self = StObject.set(x, "prodOccurrence", value.asInstanceOf[js.Any])
    
    inline def setProdType(value: OptionalProductionType): Self = StObject.set(x, "prodType", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
