package typings.coinbase.mod

import typings.coinbase.anon.Minsize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currencies extends js.Object {
  var data: js.Array[Minsize]
}

object Currencies {
  @scala.inline
  def apply(data: js.Array[Minsize]): Currencies = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currencies]
  }
}

