package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ch extends js.Object {
  var ch: Double
  var hitSide: js.UndefOr[Boolean] = js.undefined
  var line: Double
}

object Ch {
  @scala.inline
  def apply(ch: Double, line: Double, hitSide: js.UndefOr[Boolean] = js.undefined): Ch = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (!js.isUndefined(hitSide)) __obj.updateDynamic("hitSide")(hitSide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ch]
  }
}

