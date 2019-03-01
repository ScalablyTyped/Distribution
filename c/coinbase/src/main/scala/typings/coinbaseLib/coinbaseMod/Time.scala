package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var epoch: scala.Double
  var iso: java.lang.String
}

object Time {
  @scala.inline
  def apply(epoch: scala.Double, iso: java.lang.String): Time = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("epoch")(epoch)
    __obj.updateDynamic("iso")(iso)
    __obj.asInstanceOf[Time]
  }
}

