package typings.croppie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.croppie.croppieStrings.square
  - typings.croppie.croppieStrings.circle
*/
trait CropType extends js.Object

object CropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.croppie.croppieStrings.circle = this.cast("circle")
  @scala.inline
  def square: typings.croppie.croppieStrings.square = this.cast("square")
}

