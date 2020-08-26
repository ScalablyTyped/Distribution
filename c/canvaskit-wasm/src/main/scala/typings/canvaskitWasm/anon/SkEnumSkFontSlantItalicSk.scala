package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkFontSlant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFontSlant, {  Italic :canvaskit-wasm.canvaskit-wasm.SkFontSlant,   Oblique :canvaskit-wasm.canvaskit-wasm.SkFontSlant,   Upright :canvaskit-wasm.canvaskit-wasm.SkFontSlant}> */
@js.native
trait SkEnumSkFontSlantItalicSk extends js.Object {
  val Italic: SkFontSlant = js.native
  val Oblique: SkFontSlant = js.native
  val Upright: SkFontSlant = js.native
  val values: js.Array[SkFontSlant] = js.native
}

object SkEnumSkFontSlantItalicSk {
  @scala.inline
  def apply(Italic: SkFontSlant, Oblique: SkFontSlant, Upright: SkFontSlant, values: js.Array[SkFontSlant]): SkEnumSkFontSlantItalicSk = {
    val __obj = js.Dynamic.literal(Italic = Italic.asInstanceOf[js.Any], Oblique = Oblique.asInstanceOf[js.Any], Upright = Upright.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFontSlantItalicSk]
  }
  @scala.inline
  implicit class SkEnumSkFontSlantItalicSkOps[Self <: SkEnumSkFontSlantItalicSk] (val x: Self) extends AnyVal {
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
    def setItalic(value: SkFontSlant): Self = this.set("Italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setOblique(value: SkFontSlant): Self = this.set("Oblique", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpright(value: SkFontSlant): Self = this.set("Upright", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkFontSlant*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkFontSlant]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

