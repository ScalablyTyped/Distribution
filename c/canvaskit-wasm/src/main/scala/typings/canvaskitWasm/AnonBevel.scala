package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkStrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBevel extends js.Object {
  var Bevel: SkStrokeJoin
  var Miter: SkStrokeJoin
  var Round: SkStrokeJoin
}

object AnonBevel {
  @scala.inline
  def apply(Bevel: SkStrokeJoin, Miter: SkStrokeJoin, Round: SkStrokeJoin): AnonBevel = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBevel]
  }
}

