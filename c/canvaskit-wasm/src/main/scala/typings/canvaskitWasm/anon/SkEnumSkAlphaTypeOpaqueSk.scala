package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkAlphaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkAlphaType, {  Opaque :canvaskit-wasm.canvaskit-wasm.SkAlphaType,   Premul :canvaskit-wasm.canvaskit-wasm.SkAlphaType,   Unpremul :canvaskit-wasm.canvaskit-wasm.SkAlphaType}> */
@js.native
trait SkEnumSkAlphaTypeOpaqueSk extends js.Object {
  val Opaque: SkAlphaType = js.native
  val Premul: SkAlphaType = js.native
  val Unpremul: SkAlphaType = js.native
  val values: js.Array[SkAlphaType] = js.native
}

object SkEnumSkAlphaTypeOpaqueSk {
  @scala.inline
  def apply(Opaque: SkAlphaType, Premul: SkAlphaType, Unpremul: SkAlphaType, values: js.Array[SkAlphaType]): SkEnumSkAlphaTypeOpaqueSk = {
    val __obj = js.Dynamic.literal(Opaque = Opaque.asInstanceOf[js.Any], Premul = Premul.asInstanceOf[js.Any], Unpremul = Unpremul.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkAlphaTypeOpaqueSk]
  }
  @scala.inline
  implicit class SkEnumSkAlphaTypeOpaqueSkOps[Self <: SkEnumSkAlphaTypeOpaqueSk] (val x: Self) extends AnyVal {
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
    def setOpaque(value: SkAlphaType): Self = this.set("Opaque", value.asInstanceOf[js.Any])
    @scala.inline
    def setPremul(value: SkAlphaType): Self = this.set("Premul", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnpremul(value: SkAlphaType): Self = this.set("Unpremul", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkAlphaType*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkAlphaType]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

