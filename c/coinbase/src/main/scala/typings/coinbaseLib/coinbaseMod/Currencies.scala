package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currencies extends js.Object {
  var data: js.Array[coinbaseLib.Anon_IdMinsize]
}

object Currencies {
  @scala.inline
  def apply(data: js.Array[coinbaseLib.Anon_IdMinsize]): Currencies = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[Currencies]
  }
}

