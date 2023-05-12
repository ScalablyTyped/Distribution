package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.LookaheadProductionType
import typings.chevrotainTypes.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxLookahead extends StObject {
  
  var maxLookahead: Double
  
  var occurrence: Double
  
  var prodType: LookaheadProductionType
  
  var rule: Rule
}
object MaxLookahead {
  
  inline def apply(maxLookahead: Double, occurrence: Double, prodType: LookaheadProductionType, rule: Rule): MaxLookahead = {
    val __obj = js.Dynamic.literal(maxLookahead = maxLookahead.asInstanceOf[js.Any], occurrence = occurrence.asInstanceOf[js.Any], prodType = prodType.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLookahead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxLookahead] (val x: Self) extends AnyVal {
    
    inline def setMaxLookahead(value: Double): Self = StObject.set(x, "maxLookahead", value.asInstanceOf[js.Any])
    
    inline def setOccurrence(value: Double): Self = StObject.set(x, "occurrence", value.asInstanceOf[js.Any])
    
    inline def setProdType(value: LookaheadProductionType): Self = StObject.set(x, "prodType", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
