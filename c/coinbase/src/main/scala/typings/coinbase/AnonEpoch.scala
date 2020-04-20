package typings.coinbase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEpoch extends js.Object {
  var epoch: Double
  var iso: String
}

object AnonEpoch {
  @scala.inline
  def apply(epoch: Double, iso: String): AnonEpoch = {
    val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEpoch]
  }
}

