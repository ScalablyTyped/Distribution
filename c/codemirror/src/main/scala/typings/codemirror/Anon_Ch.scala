package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ch extends js.Object {
  var ch: Double
  var hitSide: js.UndefOr[Boolean] = js.undefined
  var line: Double
}

object Anon_Ch {
  @scala.inline
  def apply(ch: Double, line: Double, hitSide: js.UndefOr[Boolean] = js.undefined): Anon_Ch = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (!js.isUndefined(hitSide)) __obj.updateDynamic("hitSide")(hitSide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ch]
  }
}

