package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkImageFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkImageFormat, {  JPEG :canvaskit-wasm.canvaskit-wasm.SkImageFormat,   PNG :canvaskit-wasm.canvaskit-wasm.SkImageFormat}> */
@js.native
trait SkEnumSkImageFormatJPEGSk extends js.Object {
  val JPEG: SkImageFormat = js.native
  val PNG: SkImageFormat = js.native
  val values: js.Array[SkImageFormat] = js.native
}

object SkEnumSkImageFormatJPEGSk {
  @scala.inline
  def apply(JPEG: SkImageFormat, PNG: SkImageFormat, values: js.Array[SkImageFormat]): SkEnumSkImageFormatJPEGSk = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkImageFormatJPEGSk]
  }
  @scala.inline
  implicit class SkEnumSkImageFormatJPEGSkOps[Self <: SkEnumSkImageFormatJPEGSk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJPEG(value: SkImageFormat): Self = this.set("JPEG", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNG(value: SkImageFormat): Self = this.set("PNG", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkImageFormat*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkImageFormat]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

