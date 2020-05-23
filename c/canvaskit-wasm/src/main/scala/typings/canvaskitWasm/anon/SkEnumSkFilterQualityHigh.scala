package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkFilterQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFilterQuality, {  High  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   Low  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   Medium  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality,   None  :canvaskit-wasm.canvaskit-wasm.SkFilterQuality}> */
trait SkEnumSkFilterQualityHigh extends js.Object {
  val High: SkFilterQuality
  val Low: SkFilterQuality
  val Medium: SkFilterQuality
  val None: SkFilterQuality
  val values: js.Array[SkFilterQuality]
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
}

