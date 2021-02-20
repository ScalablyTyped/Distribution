package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteJSONSpriteSourceSize extends StObject {
  
  /**
    * number of the original height of the Frame
    */
  var h: Double = js.native
  
  /**
    * number of the original width of the Frame
    */
  var w: Double = js.native
}
object ISpriteJSONSpriteSourceSize {
  
  @scala.inline
  def apply(h: Double, w: Double): ISpriteJSONSpriteSourceSize = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSpriteSourceSize]
  }
  
  @scala.inline
  implicit class ISpriteJSONSpriteSourceSizeMutableBuilder[Self <: ISpriteJSONSpriteSourceSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
