package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITexturePackerJSON extends StObject {
  
  /**
    * The frame data of the Packer
    */
  var frames: js.Array[Double] = js.native
  
  /**
    * The frame ID
    */
  var name: String = js.native
  
  /**
    * The options of the Packer
    */
  var options: ITexturePackerOptions = js.native
  
  /**
    * The base64 channel data
    */
  var sets: js.Any = js.native
}
object ITexturePackerJSON {
  
  @scala.inline
  def apply(frames: js.Array[Double], name: String, options: ITexturePackerOptions, sets: js.Any): ITexturePackerJSON = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITexturePackerJSON]
  }
  
  @scala.inline
  implicit class ITexturePackerJSONMutableBuilder[Self <: ITexturePackerJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: js.Array[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: Double*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ITexturePackerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSets(value: js.Any): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
  }
}
