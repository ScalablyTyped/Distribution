package typings.coinbase.coinbaseMod

import typings.coinbase.Anon_IdMinsize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currencies extends js.Object {
  var data: js.Array[Anon_IdMinsize]
}

object Currencies {
  @scala.inline
  def apply(data: js.Array[Anon_IdMinsize]): Currencies = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Currencies]
  }
}

