package typings
package blockedLib.blockedMod.BlockedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var threshold: scala.Double
}

object Options {
  @scala.inline
  def apply(threshold: scala.Double): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[Options]
  }
}

