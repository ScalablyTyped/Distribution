package typings.coinbase.coinbaseMod

import typings.coinbase.Anon_Epoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var data: Anon_Epoch
}

object Time {
  @scala.inline
  def apply(data: Anon_Epoch): Time = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Time]
  }
}

