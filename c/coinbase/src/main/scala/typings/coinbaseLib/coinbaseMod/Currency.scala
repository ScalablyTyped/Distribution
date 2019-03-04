package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  /**
    * Abbreviation e.g. "USD" or "BTC"
    */
  var id: java.lang.String
  /**
    * Floating-point number in a string
    */
  var min_size: java.lang.String
  /**
    * Full name e.g. "United Arab Emirates Dirham"
    */
  var name: java.lang.String
}

object Currency {
  @scala.inline
  def apply(id: java.lang.String, min_size: java.lang.String, name: java.lang.String): Currency = {
    val __obj = js.Dynamic.literal(id = id, min_size = min_size, name = name)
  
    __obj.asInstanceOf[Currency]
  }
}

