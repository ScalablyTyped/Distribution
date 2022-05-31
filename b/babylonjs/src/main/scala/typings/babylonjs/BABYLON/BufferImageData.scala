package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines One Image in the file. It requires only the position in the file
  * as well as the length.
  */
trait BufferImageData extends StObject {
  
  /**
    * Length of the image data.
    */
  var length: Double
  
  /**
    * Position of the data from the null terminator delimiting the end of the JSON.
    */
  var position: Double
}
object BufferImageData {
  
  inline def apply(length: Double, position: Double): BufferImageData = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferImageData]
  }
  
  extension [Self <: BufferImageData](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
