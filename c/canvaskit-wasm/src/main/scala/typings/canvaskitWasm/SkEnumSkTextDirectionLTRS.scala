package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkTextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined canvaskit-wasm.canvaskit-wasm.SkEnum<canvaskit-wasm.canvaskit-wasm.SkTextDirection, {  LTR  :canvaskit-wasm.canvaskit-wasm.SkTextDirection,   RTL  :canvaskit-wasm.canvaskit-wasm.SkTextDirection}> */
trait SkEnumSkTextDirectionLTRS extends js.Object {
  val LTR: SkTextDirection
  val RTL: SkTextDirection
  val values: js.Array[SkTextDirection]
}

object SkEnumSkTextDirectionLTRS {
  @scala.inline
  def apply(LTR: SkTextDirection, RTL: SkTextDirection, values: js.Array[SkTextDirection]): SkEnumSkTextDirectionLTRS = {
    val __obj = js.Dynamic.literal(LTR = LTR.asInstanceOf[js.Any], RTL = RTL.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkEnumSkTextDirectionLTRS]
  }
}

