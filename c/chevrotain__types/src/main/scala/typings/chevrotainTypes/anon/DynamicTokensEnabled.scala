package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicTokensEnabled extends StObject {
  
  var dynamicTokensEnabled: Boolean
  
  var hasPredicates: Boolean
  
  var maxLookahead: Double
  
  var prodOccurrence: Double
  
  var rule: Rule
}
object DynamicTokensEnabled {
  
  inline def apply(
    dynamicTokensEnabled: Boolean,
    hasPredicates: Boolean,
    maxLookahead: Double,
    prodOccurrence: Double,
    rule: Rule
  ): DynamicTokensEnabled = {
    val __obj = js.Dynamic.literal(dynamicTokensEnabled = dynamicTokensEnabled.asInstanceOf[js.Any], hasPredicates = hasPredicates.asInstanceOf[js.Any], maxLookahead = maxLookahead.asInstanceOf[js.Any], prodOccurrence = prodOccurrence.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTokensEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicTokensEnabled] (val x: Self) extends AnyVal {
    
    inline def setDynamicTokensEnabled(value: Boolean): Self = StObject.set(x, "dynamicTokensEnabled", value.asInstanceOf[js.Any])
    
    inline def setHasPredicates(value: Boolean): Self = StObject.set(x, "hasPredicates", value.asInstanceOf[js.Any])
    
    inline def setMaxLookahead(value: Double): Self = StObject.set(x, "maxLookahead", value.asInstanceOf[js.Any])
    
    inline def setProdOccurrence(value: Double): Self = StObject.set(x, "prodOccurrence", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
