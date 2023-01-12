package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpriteJSONSpriteFrameData extends StObject {
  
  /**
    * number of the height of the Frame
    */
  var h: Double
  
  /**
    * number of the width of the Frame
    */
  var w: Double
  
  /**
    * number of the x offset of the Frame
    */
  var x: Double
  
  /**
    * number of the y offset of the Frame
    */
  var y: Double
}
object ISpriteJSONSpriteFrameData {
  
  inline def apply(h: Double, w: Double, x: Double, y: Double): ISpriteJSONSpriteFrameData = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSpriteFrameData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISpriteJSONSpriteFrameData] (val x: Self) extends AnyVal {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
