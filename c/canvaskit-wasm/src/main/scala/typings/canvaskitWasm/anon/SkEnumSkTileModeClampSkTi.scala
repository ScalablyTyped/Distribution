package typings.canvaskitWasm.anon

import typings.canvaskitWasm.mod.SkTileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkTileMode, {  Clamp :canvaskit-wasm.canvaskit-wasm.SkTileMode,   Decal :canvaskit-wasm.canvaskit-wasm.SkTileMode,   Mirror :canvaskit-wasm.canvaskit-wasm.SkTileMode,   Repeat :canvaskit-wasm.canvaskit-wasm.SkTileMode}> */
@js.native
trait SkEnumSkTileModeClampSkTi extends js.Object {
  val Clamp: SkTileMode = js.native
  val Decal: SkTileMode = js.native
  val Mirror: SkTileMode = js.native
  val Repeat: SkTileMode = js.native
  val values: js.Array[SkTileMode] = js.native
}

object SkEnumSkTileModeClampSkTi {
  @scala.inline
  def apply(
    Clamp: SkTileMode,
    Decal: SkTileMode,
    Mirror: SkTileMode,
    Repeat: SkTileMode,
    values: js.Array[SkTileMode]
  ): SkEnumSkTileModeClampSkTi = {
    val __obj = js.Dynamic.literal(Clamp = Clamp.asInstanceOf[js.Any], Decal = Decal.asInstanceOf[js.Any], Mirror = Mirror.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkTileModeClampSkTi]
  }
  @scala.inline
  implicit class SkEnumSkTileModeClampSkTiOps[Self <: SkEnumSkTileModeClampSkTi] (val x: Self) extends AnyVal {
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
    def setClamp(value: SkTileMode): Self = this.set("Clamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecal(value: SkTileMode): Self = this.set("Decal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirror(value: SkTileMode): Self = this.set("Mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: SkTileMode): Self = this.set("Repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: SkTileMode*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SkTileMode]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

