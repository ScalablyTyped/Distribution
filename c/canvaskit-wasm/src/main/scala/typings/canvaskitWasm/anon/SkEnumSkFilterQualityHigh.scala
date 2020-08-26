package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkFilterQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFilterQuality, {  High :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   Low :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   Medium :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   None :canvaskit-wasm.canvaskit-wasm.SkFilterQuality}> */
@js.native
trait SkEnumSkFilterQualityHigh extends js.Object {
  val High: SkFilterQuality = js.native
  val Low: SkFilterQuality = js.native
  val Medium: SkFilterQuality = js.native
  val None: SkFilterQuality = js.native
  val values: js.Array[SkFilterQuality] = js.native
}

object SkEnumSkFilterQualityHigh {
  @scala.inline
  def apply(
    High: SkFilterQuality,
    Low: SkFilterQuality,
    Medium: SkFilterQuality,
    None: SkFilterQuality,
    values: js.Array[SkFilterQuality]
  ): SkEnumSkFilterQualityHigh = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFilterQualityHigh]
  }
  @scala.inline
  implicit class SkEnumSkFilterQualityHighOps[Self <: SkEnumSkFilterQualityHigh] (val x: Self) extends AnyVal {
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
    def setHigh(value: SkFilterQuality): Self = this.set("High", value.asInstanceOf[js.Any])
    @scala.inline
    def setLow(value: SkFilterQuality): Self = this.set("Low", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: SkFilterQuality): Self = this.set("Medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: SkFilterQuality): Self = this.set("None", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkFilterQuality*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkFilterQuality]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

