package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkFillType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvenOdd extends js.Object {
  var EvenOdd: SkFillType
  var InverseEvenOdd: SkFillType
  var InverseWinding: SkFillType
  var Winding: SkFillType
}

object AnonEvenOdd {
  @scala.inline
  def apply(EvenOdd: SkFillType, InverseEvenOdd: SkFillType, InverseWinding: SkFillType, Winding: SkFillType): AnonEvenOdd = {
    val __obj = js.Dynamic.literal(EvenOdd = EvenOdd.asInstanceOf[js.Any], InverseEvenOdd = InverseEvenOdd.asInstanceOf[js.Any], InverseWinding = InverseWinding.asInstanceOf[js.Any], Winding = Winding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvenOdd]
  }
}

