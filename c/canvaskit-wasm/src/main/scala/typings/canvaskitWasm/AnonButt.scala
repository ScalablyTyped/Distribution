package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkStrokeCap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButt extends js.Object {
  var Butt: SkStrokeCap
  var Round: SkStrokeCap
  var Square: SkStrokeCap
}

object AnonButt {
  @scala.inline
  def apply(Butt: SkStrokeCap, Round: SkStrokeCap, Square: SkStrokeCap): AnonButt = {
    val __obj = js.Dynamic.literal(Butt = Butt.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], Square = Square.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonButt]
  }
}

