package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkTileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkTileMode, {  Clamp  :canvaskit-wasm.canvaskit-wasm.SkTileMode,   Decal  :canvaskit-wasm.canvaskit-wasm.SkTileMode,   Mirror  :canvaskit-wasm.canvaskit-wasm.SkTileMode,   Repeat  :canvaskit-wasm.canvaskit-wasm.SkTileMode}> */
trait SkEnumSkTileModeClampSkTi extends js.Object {
  val Clamp: SkTileMode
  val Decal: SkTileMode
  val Mirror: SkTileMode
  val Repeat: SkTileMode
  val values: js.Array[SkTileMode]
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
}

