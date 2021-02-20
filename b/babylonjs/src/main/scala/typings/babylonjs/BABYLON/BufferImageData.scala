package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines One Image in the file. It requires only the position in the file
  * as well as the length.
  */
@js.native
trait BufferImageData extends StObject {
  
  /**
    * Length of the image data.
    */
  var length: Double = js.native
  
  /**
    * Position of the data from the null terminator delimiting the end of the JSON.
    */
  var position: Double = js.native
}
object BufferImageData {
  
  @scala.inline
  def apply(length: Double, position: Double): BufferImageData = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferImageData]
  }
  
  @scala.inline
  implicit class BufferImageDataMutableBuilder[Self <: BufferImageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
