package typings.canvaskitDashWasm

import typings.canvaskitDashWasm.canvaskitDashWasmMod.SkPathOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DifferenceIntersect extends js.Object {
  var Difference: SkPathOp
  var Intersect: SkPathOp
  var ReverseDifference: SkPathOp
  var Union: SkPathOp
  var XOR: SkPathOp
}

object Anon_DifferenceIntersect {
  @scala.inline
  def apply(
    Difference: SkPathOp,
    Intersect: SkPathOp,
    ReverseDifference: SkPathOp,
    Union: SkPathOp,
    XOR: SkPathOp
  ): Anon_DifferenceIntersect = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], ReverseDifference = ReverseDifference.asInstanceOf[js.Any], Union = Union.asInstanceOf[js.Any], XOR = XOR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DifferenceIntersect]
  }
}

