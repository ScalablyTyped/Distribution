package typings.coinbase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdMinsize extends js.Object {
  /**
    * Abbreviation e.g. "USD" or "BTC"
    */
  var id: String
  /**
    * Floating-point number in a string
    */
  var min_size: String
  /**
    * Full name e.g. "United Arab Emirates Dirham"
    */
  var name: String
}

object AnonIdMinsize {
  @scala.inline
  def apply(id: String, min_size: String, name: String): AnonIdMinsize = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], min_size = min_size.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdMinsize]
  }
}

