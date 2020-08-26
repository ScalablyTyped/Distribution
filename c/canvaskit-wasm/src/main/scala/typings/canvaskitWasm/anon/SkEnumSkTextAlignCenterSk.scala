package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkTextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkTextAlign, {  Center :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   End :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Justify :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Left :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Right :canvaskit-wasm.canvaskit-wasm.SkTextAlign,   Start :canvaskit-wasm.canvaskit-wasm.SkTextAlign}> */
@js.native
trait SkEnumSkTextAlignCenterSk extends js.Object {
  val Center: SkTextAlign = js.native
  val End: SkTextAlign = js.native
  val Justify: SkTextAlign = js.native
  val Left: SkTextAlign = js.native
  val Right: SkTextAlign = js.native
  val Start: SkTextAlign = js.native
  val values: js.Array[SkTextAlign] = js.native
}

object SkEnumSkTextAlignCenterSk {
  @scala.inline
  def apply(
    Center: SkTextAlign,
    End: SkTextAlign,
    Justify: SkTextAlign,
    Left: SkTextAlign,
    Right: SkTextAlign,
    Start: SkTextAlign,
    values: js.Array[SkTextAlign]
  ): SkEnumSkTextAlignCenterSk = {
    val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Justify = Justify.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkTextAlignCenterSk]
  }
  @scala.inline
  implicit class SkEnumSkTextAlignCenterSkOps[Self <: SkEnumSkTextAlignCenterSk] (val x: Self) extends AnyVal {
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
    def setCenter(value: SkTextAlign): Self = this.set("Center", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: SkTextAlign): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def setJustify(value: SkTextAlign): Self = this.set("Justify", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: SkTextAlign): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: SkTextAlign): Self = this.set("Right", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: SkTextAlign): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkTextAlign*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkTextAlign]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

