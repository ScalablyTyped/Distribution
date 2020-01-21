package typings.coinbase.mod

import typings.coinbase.AnonEpoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var data: AnonEpoch
}

object Time {
  @scala.inline
  def apply(data: AnonEpoch): Time = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Time]
  }
}

