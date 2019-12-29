package typings.canvaskitDashWasm

import typings.canvaskitDashWasm.canvaskitDashWasmMod.SkFillType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvenOdd extends js.Object {
  var EvenOdd: SkFillType
  var InverseEvenOdd: SkFillType
  var InverseWinding: SkFillType
  var Winding: SkFillType
}

object Anon_EvenOdd {
  @scala.inline
  def apply(EvenOdd: SkFillType, InverseEvenOdd: SkFillType, InverseWinding: SkFillType, Winding: SkFillType): Anon_EvenOdd = {
    val __obj = js.Dynamic.literal(EvenOdd = EvenOdd.asInstanceOf[js.Any], InverseEvenOdd = InverseEvenOdd.asInstanceOf[js.Any], InverseWinding = InverseWinding.asInstanceOf[js.Any], Winding = Winding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EvenOdd]
  }
}

