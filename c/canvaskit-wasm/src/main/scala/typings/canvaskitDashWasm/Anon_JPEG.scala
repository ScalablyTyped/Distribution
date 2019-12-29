package typings.canvaskitDashWasm

import typings.canvaskitDashWasm.canvaskitDashWasmMod.SkImageFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JPEG extends js.Object {
  var JPEG: SkImageFormat
  var PNG: SkImageFormat
}

object Anon_JPEG {
  @scala.inline
  def apply(JPEG: SkImageFormat, PNG: SkImageFormat): Anon_JPEG = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_JPEG]
  }
}

