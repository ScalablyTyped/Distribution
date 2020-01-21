package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkClipOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDifference extends js.Object {
  var Difference: SkClipOp
  var Intersect: SkClipOp
}

object AnonDifference {
  @scala.inline
  def apply(Difference: SkClipOp, Intersect: SkClipOp): AnonDifference = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDifference]
  }
}

