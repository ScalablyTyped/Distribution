package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkBlurStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkBlurStyle, {  Inner :canvaskit-wasm.canvaskit-wasm.SkBlurStyle,   Normal :canvaskit-wasm.canvaskit-wasm.SkBlurStyle,   Outer :canvaskit-wasm.canvaskit-wasm.SkBlurStyle,   Solid :canvaskit-wasm.canvaskit-wasm.SkBlurStyle}> */
@js.native
trait SkEnumSkBlurStyleInnerSkB extends js.Object {
  val Inner: SkBlurStyle = js.native
  val Normal: SkBlurStyle = js.native
  val Outer: SkBlurStyle = js.native
  val Solid: SkBlurStyle = js.native
  val values: js.Array[SkBlurStyle] = js.native
}

object SkEnumSkBlurStyleInnerSkB {
  @scala.inline
  def apply(
    Inner: SkBlurStyle,
    Normal: SkBlurStyle,
    Outer: SkBlurStyle,
    Solid: SkBlurStyle,
    values: js.Array[SkBlurStyle]
  ): SkEnumSkBlurStyleInnerSkB = {
    val __obj = js.Dynamic.literal(Inner = Inner.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Outer = Outer.asInstanceOf[js.Any], Solid = Solid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkBlurStyleInnerSkB]
  }
  @scala.inline
  implicit class SkEnumSkBlurStyleInnerSkBOps[Self <: SkEnumSkBlurStyleInnerSkB] (val x: Self) extends AnyVal {
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
    def setInner(value: SkBlurStyle): Self = this.set("Inner", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: SkBlurStyle): Self = this.set("Normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuter(value: SkBlurStyle): Self = this.set("Outer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolid(value: SkBlurStyle): Self = this.set("Solid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkBlurStyle*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkBlurStyle]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

