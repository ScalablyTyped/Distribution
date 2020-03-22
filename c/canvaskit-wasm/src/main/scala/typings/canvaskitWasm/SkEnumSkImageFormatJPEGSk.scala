package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkImageFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkImageFormat, {  JPEG  :canvaskit-wasm.canvaskit-wasm.SkImageFormat,   PNG  :canvaskit-wasm.canvaskit-wasm.SkImageFormat}> */
trait SkEnumSkImageFormatJPEGSk extends js.Object {
  val JPEG: SkImageFormat
  val PNG: SkImageFormat
  val values: js.Array[SkImageFormat]
}

object SkEnumSkImageFormatJPEGSk {
  @scala.inline
  def apply(JPEG: SkImageFormat, PNG: SkImageFormat, values: js.Array[SkImageFormat]): SkEnumSkImageFormatJPEGSk = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkEnumSkImageFormatJPEGSk]
  }
}

