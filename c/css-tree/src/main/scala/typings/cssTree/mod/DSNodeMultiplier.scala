package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Multiplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeMultiplier
  extends StObject
     with DSNode {
  
  var comma: Boolean
  
  var max: Double
  
  var min: Double
  
  var term: DSNodeMultiplied
  
  var `type`: Multiplier
}
object DSNodeMultiplier {
  
  @scala.inline
  def apply(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied): DSNodeMultiplier = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Multiplier")
    __obj.asInstanceOf[DSNodeMultiplier]
  }
  
  @scala.inline
  implicit class DSNodeMultiplierMutableBuilder[Self <: DSNodeMultiplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComma(value: Boolean): Self = StObject.set(x, "comma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm(value: DSNodeMultiplied): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Multiplier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
