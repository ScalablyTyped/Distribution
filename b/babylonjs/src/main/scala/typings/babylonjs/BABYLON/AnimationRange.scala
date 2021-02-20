package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationRange extends StObject {
  
  /**The starting frame of the animation */
  var from: Double = js.native
  
  /**The name of the animation range**/
  var name: String = js.native
  
  /**The ending frame of the animation*/
  var to: Double = js.native
}
object AnimationRange {
  
  @scala.inline
  def apply(from: Double, name: String, to: Double): AnimationRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationRange]
  }
  
  @scala.inline
  implicit class AnimationRangeMutableBuilder[Self <: AnimationRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
