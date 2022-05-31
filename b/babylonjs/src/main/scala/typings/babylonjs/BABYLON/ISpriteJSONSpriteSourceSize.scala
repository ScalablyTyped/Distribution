package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpriteJSONSpriteSourceSize extends StObject {
  
  /**
    * number of the original height of the Frame
    */
  var h: Double
  
  /**
    * number of the original width of the Frame
    */
  var w: Double
}
object ISpriteJSONSpriteSourceSize {
  
  inline def apply(h: Double, w: Double): ISpriteJSONSpriteSourceSize = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSpriteSourceSize]
  }
  
  extension [Self <: ISpriteJSONSpriteSourceSize](x: Self) {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
