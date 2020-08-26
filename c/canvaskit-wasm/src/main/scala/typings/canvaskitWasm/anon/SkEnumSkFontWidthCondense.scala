package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkFontWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFontWidth, {  Condensed :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   Expanded :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   ExtraCondensed :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   ExtraExpanded :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   Normal :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   SemiCondensed :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   SemiExpanded :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   UltraCondensed :canvaskit-wasm.canvaskit-wasm.SkFontWidth,   UltraExpanded :canvaskit-wasm.canvaskit-wasm.SkFontWidth}> */
@js.native
trait SkEnumSkFontWidthCondense extends js.Object {
  val Condensed: SkFontWidth = js.native
  val Expanded: SkFontWidth = js.native
  val ExtraCondensed: SkFontWidth = js.native
  val ExtraExpanded: SkFontWidth = js.native
  val Normal: SkFontWidth = js.native
  val SemiCondensed: SkFontWidth = js.native
  val SemiExpanded: SkFontWidth = js.native
  val UltraCondensed: SkFontWidth = js.native
  val UltraExpanded: SkFontWidth = js.native
  val values: js.Array[SkFontWidth] = js.native
}

object SkEnumSkFontWidthCondense {
  @scala.inline
  def apply(
    Condensed: SkFontWidth,
    Expanded: SkFontWidth,
    ExtraCondensed: SkFontWidth,
    ExtraExpanded: SkFontWidth,
    Normal: SkFontWidth,
    SemiCondensed: SkFontWidth,
    SemiExpanded: SkFontWidth,
    UltraCondensed: SkFontWidth,
    UltraExpanded: SkFontWidth,
    values: js.Array[SkFontWidth]
  ): SkEnumSkFontWidthCondense = {
    val __obj = js.Dynamic.literal(Condensed = Condensed.asInstanceOf[js.Any], Expanded = Expanded.asInstanceOf[js.Any], ExtraCondensed = ExtraCondensed.asInstanceOf[js.Any], ExtraExpanded = ExtraExpanded.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], SemiCondensed = SemiCondensed.asInstanceOf[js.Any], SemiExpanded = SemiExpanded.asInstanceOf[js.Any], UltraCondensed = UltraCondensed.asInstanceOf[js.Any], UltraExpanded = UltraExpanded.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFontWidthCondense]
  }
  @scala.inline
  implicit class SkEnumSkFontWidthCondenseOps[Self <: SkEnumSkFontWidthCondense] (val x: Self) extends AnyVal {
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
    def setCondensed(value: SkFontWidth): Self = this.set("Condensed", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: SkFontWidth): Self = this.set("Expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraCondensed(value: SkFontWidth): Self = this.set("ExtraCondensed", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraExpanded(value: SkFontWidth): Self = this.set("ExtraExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: SkFontWidth): Self = this.set("Normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemiCondensed(value: SkFontWidth): Self = this.set("SemiCondensed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemiExpanded(value: SkFontWidth): Self = this.set("SemiExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setUltraCondensed(value: SkFontWidth): Self = this.set("UltraCondensed", value.asInstanceOf[js.Any])
    @scala.inline
    def setUltraExpanded(value: SkFontWidth): Self = this.set("UltraExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkFontWidth*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkFontWidth]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

