package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpriteJSONAtlas extends StObject {
  
  /**
    * Array of objects that contain the frame data.
    */
  var frames: js.Array[ISpriteJSONSprite]
  
  /**
    * object basic object containing the sprite meta data.
    */
  var meta: js.UndefOr[js.Object] = js.undefined
}
object ISpriteJSONAtlas {
  
  inline def apply(frames: js.Array[ISpriteJSONSprite]): ISpriteJSONAtlas = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONAtlas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISpriteJSONAtlas] (val x: Self) extends AnyVal {
    
    inline def setFrames(value: js.Array[ISpriteJSONSprite]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: ISpriteJSONSprite*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
