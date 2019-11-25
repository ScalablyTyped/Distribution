package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cropperjs.cropperjsStrings.low
  - typings.cropperjs.cropperjsStrings.medium
  - typings.cropperjs.cropperjsStrings.high
*/
trait ImageSmoothingQuality extends js.Object

object ImageSmoothingQuality {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.cropperjs.cropperjsStrings.high = this.cast("high")
  @scala.inline
  def low: typings.cropperjs.cropperjsStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.cropperjs.cropperjsStrings.medium = this.cast("medium")
}

