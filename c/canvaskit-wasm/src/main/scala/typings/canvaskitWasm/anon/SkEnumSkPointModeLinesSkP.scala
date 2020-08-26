package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkPointMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkPointMode, {  Lines :canvaskit-wasm.canvaskit-wasm.SkPointMode,   Points :canvaskit-wasm.canvaskit-wasm.SkPointMode,   Polygon :canvaskit-wasm.canvaskit-wasm.SkPointMode}> */
@js.native
trait SkEnumSkPointModeLinesSkP extends js.Object {
  val Lines: SkPointMode = js.native
  val Points: SkPointMode = js.native
  val Polygon: SkPointMode = js.native
  val values: js.Array[SkPointMode] = js.native
}

object SkEnumSkPointModeLinesSkP {
  @scala.inline
  def apply(Lines: SkPointMode, Points: SkPointMode, Polygon: SkPointMode, values: js.Array[SkPointMode]): SkEnumSkPointModeLinesSkP = {
    val __obj = js.Dynamic.literal(Lines = Lines.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkPointModeLinesSkP]
  }
  @scala.inline
  implicit class SkEnumSkPointModeLinesSkPOps[Self <: SkEnumSkPointModeLinesSkP] (val x: Self) extends AnyVal {
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
    def setLines(value: SkPointMode): Self = this.set("Lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoints(value: SkPointMode): Self = this.set("Points", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygon(value: SkPointMode): Self = this.set("Polygon", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkPointMode*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkPointMode]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

