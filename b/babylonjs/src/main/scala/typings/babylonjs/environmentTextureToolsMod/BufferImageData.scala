package typings.babylonjs.environmentTextureToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines One Image in the file. It requires only the position in the file
  * as well as the length.
  */
trait BufferImageData extends js.Object {
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
  @scala.inline
  def apply(length: Double, position: Double): BufferImageData = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferImageData]
  }
}

