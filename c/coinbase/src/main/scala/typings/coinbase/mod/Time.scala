package typings.coinbase.mod

import typings.coinbase.anon.Epoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var data: Epoch
}

object Time {
  @scala.inline
  def apply(data: Epoch): Time = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

