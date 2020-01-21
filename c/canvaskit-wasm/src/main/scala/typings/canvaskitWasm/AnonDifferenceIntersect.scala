package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkPathOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDifferenceIntersect extends js.Object {
  var Difference: SkPathOp
  var Intersect: SkPathOp
  var ReverseDifference: SkPathOp
  var Union: SkPathOp
  var XOR: SkPathOp
}

object AnonDifferenceIntersect {
  @scala.inline
  def apply(
    Difference: SkPathOp,
    Intersect: SkPathOp,
    ReverseDifference: SkPathOp,
    Union: SkPathOp,
    XOR: SkPathOp
  ): AnonDifferenceIntersect = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], ReverseDifference = ReverseDifference.asInstanceOf[js.Any], Union = Union.asInstanceOf[js.Any], XOR = XOR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDifferenceIntersect]
  }
}

