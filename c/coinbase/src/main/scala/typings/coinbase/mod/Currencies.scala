package typings.coinbase.mod

import typings.coinbase.AnonIdMinsize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currencies extends js.Object {
  var data: js.Array[AnonIdMinsize]
}

object Currencies {
  @scala.inline
  def apply(data: js.Array[AnonIdMinsize]): Currencies = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Currencies]
  }
}

