package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkClipOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkClipOp, {  Difference :canvaskit-wasm.canvaskit-wasm.SkClipOp,   Intersect :canvaskit-wasm.canvaskit-wasm.SkClipOp}> */
@js.native
trait SkEnumSkClipOpDifferenceS extends js.Object {
  val Difference: SkClipOp = js.native
  val Intersect: SkClipOp = js.native
  val values: js.Array[SkClipOp] = js.native
}

object SkEnumSkClipOpDifferenceS {
  @scala.inline
  def apply(Difference: SkClipOp, Intersect: SkClipOp, values: js.Array[SkClipOp]): SkEnumSkClipOpDifferenceS = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkClipOpDifferenceS]
  }
  @scala.inline
  implicit class SkEnumSkClipOpDifferenceSOps[Self <: SkEnumSkClipOpDifferenceS] (val x: Self) extends AnyVal {
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
    def setDifference(value: SkClipOp): Self = this.set("Difference", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersect(value: SkClipOp): Self = this.set("Intersect", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkClipOp*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkClipOp]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

