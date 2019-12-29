package typings.canvaskitDashWasm

import typings.canvaskitDashWasm.canvaskitDashWasmMod.SkStrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bevel extends js.Object {
  var Bevel: SkStrokeJoin
  var Miter: SkStrokeJoin
  var Round: SkStrokeJoin
}

object Anon_Bevel {
  @scala.inline
  def apply(Bevel: SkStrokeJoin, Miter: SkStrokeJoin, Round: SkStrokeJoin): Anon_Bevel = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bevel]
  }
}

