package typings.coinbase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Epoch extends js.Object {
  var epoch: Double
  var iso: String
}

object Epoch {
  @scala.inline
  def apply(epoch: Double, iso: String): Epoch = {
    val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[Epoch]
  }
}

