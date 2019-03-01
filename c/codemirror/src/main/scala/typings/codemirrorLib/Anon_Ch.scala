package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ch extends js.Object {
  var ch: scala.Double
  var hitSide: js.UndefOr[scala.Boolean] = js.undefined
  var line: scala.Double
}

object Anon_Ch {
  @scala.inline
  def apply(ch: scala.Double, line: scala.Double, hitSide: js.UndefOr[scala.Boolean] = js.undefined): Anon_Ch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ch")(ch)
    __obj.updateDynamic("line")(line)
    if (!js.isUndefined(hitSide)) __obj.updateDynamic("hitSide")(hitSide)
    __obj.asInstanceOf[Anon_Ch]
  }
}

