package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteJSONSpriteFrameData extends StObject {
  
  /**
    * number of the height of the Frame
    */
  var h: Double = js.native
  
  /**
    * number of the width of the Frame
    */
  var w: Double = js.native
  
  /**
    * number of the x offset of the Frame
    */
  var x: Double = js.native
  
  /**
    * number of the y offset of the Frame
    */
  var y: Double = js.native
}
object ISpriteJSONSpriteFrameData {
  
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): ISpriteJSONSpriteFrameData = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSpriteFrameData]
  }
  
  @scala.inline
  implicit class ISpriteJSONSpriteFrameDataMutableBuilder[Self <: ISpriteJSONSpriteFrameData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
