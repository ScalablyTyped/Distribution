package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var data: coinbaseLib.Anon_Epoch
}

object Time {
  @scala.inline
  def apply(data: coinbaseLib.Anon_Epoch): Time = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[Time]
  }
}

