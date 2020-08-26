package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkFontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkFontWeight, {  ExtraBlack :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Black :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   ExtraBold :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Bold :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   SemiBold :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Medium :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Normal :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Light :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   ExtraLight :canvaskit-wasm.canvaskit-wasm.SkFontWeight,   Thin :canvaskit-wasm.canvaskit-wasm.SkFontWeight}> */
@js.native
trait SkEnumSkFontWeightExtraBl extends js.Object {
  val Black: SkFontWeight = js.native
  val Bold: SkFontWeight = js.native
  val ExtraBlack: SkFontWeight = js.native
  val ExtraBold: SkFontWeight = js.native
  val ExtraLight: SkFontWeight = js.native
  val Light: SkFontWeight = js.native
  val Medium: SkFontWeight = js.native
  val Normal: SkFontWeight = js.native
  val SemiBold: SkFontWeight = js.native
  val Thin: SkFontWeight = js.native
  val values: js.Array[SkFontWeight] = js.native
}

object SkEnumSkFontWeightExtraBl {
  @scala.inline
  def apply(
    Black: SkFontWeight,
    Bold: SkFontWeight,
    ExtraBlack: SkFontWeight,
    ExtraBold: SkFontWeight,
    ExtraLight: SkFontWeight,
    Light: SkFontWeight,
    Medium: SkFontWeight,
    Normal: SkFontWeight,
    SemiBold: SkFontWeight,
    Thin: SkFontWeight,
    values: js.Array[SkFontWeight]
  ): SkEnumSkFontWeightExtraBl = {
    val __obj = js.Dynamic.literal(Black = Black.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], ExtraBlack = ExtraBlack.asInstanceOf[js.Any], ExtraBold = ExtraBold.asInstanceOf[js.Any], ExtraLight = ExtraLight.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], SemiBold = SemiBold.asInstanceOf[js.Any], Thin = Thin.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkFontWeightExtraBl]
  }
  @scala.inline
  implicit class SkEnumSkFontWeightExtraBlOps[Self <: SkEnumSkFontWeightExtraBl] (val x: Self) extends AnyVal {
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
    def setBlack(value: SkFontWeight): Self = this.set("Black", value.asInstanceOf[js.Any])
    @scala.inline
    def setBold(value: SkFontWeight): Self = this.set("Bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraBlack(value: SkFontWeight): Self = this.set("ExtraBlack", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraBold(value: SkFontWeight): Self = this.set("ExtraBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraLight(value: SkFontWeight): Self = this.set("ExtraLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLight(value: SkFontWeight): Self = this.set("Light", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: SkFontWeight): Self = this.set("Medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: SkFontWeight): Self = this.set("Normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemiBold(value: SkFontWeight): Self = this.set("SemiBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setThin(value: SkFontWeight): Self = this.set("Thin", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkFontWeight*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkFontWeight]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

