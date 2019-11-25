package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cropperjs.cropperjsStrings.crop
  - typings.cropperjs.cropperjsStrings.move
  - typings.cropperjs.cropperjsStrings.none
*/
trait DragMode extends js.Object

object DragMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crop: typings.cropperjs.cropperjsStrings.crop = this.cast("crop")
  @scala.inline
  def move: typings.cropperjs.cropperjsStrings.move = this.cast("move")
  @scala.inline
  def none: typings.cropperjs.cropperjsStrings.none = this.cast("none")
}

