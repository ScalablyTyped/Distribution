package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkImageFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPEG extends js.Object {
  var JPEG: SkImageFormat
  var PNG: SkImageFormat
}

object AnonJPEG {
  @scala.inline
  def apply(JPEG: SkImageFormat, PNG: SkImageFormat): AnonJPEG = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPEG]
  }
}

