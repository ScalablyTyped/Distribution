package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleDelta extends js.Object {
  var current: js.UndefOr[scala.Double] = js.undefined
  var previous: js.UndefOr[scala.Double] = js.undefined
}

object DoubleDelta {
  @scala.inline
  def apply(current: scala.Int | scala.Double = null, previous: scala.Int | scala.Double = null): DoubleDelta = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleDelta]
  }
}

