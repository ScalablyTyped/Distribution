package typings.croppie.croppieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.croppie.croppieStrings.jpeg
  - typings.croppie.croppieStrings.png
  - typings.croppie.croppieStrings.webp
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typings.croppie.croppieStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typings.croppie.croppieStrings.png = this.cast("png")
  @scala.inline
  def webp: typings.croppie.croppieStrings.webp = this.cast("webp")
}

