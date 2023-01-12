package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITexturePackerJSON extends StObject {
  
  /**
    * The frame data of the Packer
    */
  var frames: js.Array[Double]
  
  /**
    * The frame ID
    */
  var name: String
  
  /**
    * The options of the Packer
    */
  var options: ITexturePackerOptions
  
  /**
    * The base64 channel data
    */
  var sets: Any
}
object ITexturePackerJSON {
  
  inline def apply(frames: js.Array[Double], name: String, options: ITexturePackerOptions, sets: Any): ITexturePackerJSON = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITexturePackerJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITexturePackerJSON] (val x: Self) extends AnyVal {
    
    inline def setFrames(value: js.Array[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: Double*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ITexturePackerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSets(value: Any): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
  }
}
