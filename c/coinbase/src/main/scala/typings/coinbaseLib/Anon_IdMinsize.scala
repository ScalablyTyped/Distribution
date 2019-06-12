package typings
package coinbaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdMinsize extends js.Object {
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

object Anon_IdMinsize {
  @scala.inline
  def apply(id: java.lang.String, min_size: java.lang.String, name: java.lang.String): Anon_IdMinsize = {
    val __obj = js.Dynamic.literal(id = id, min_size = min_size, name = name)
  
    __obj.asInstanceOf[Anon_IdMinsize]
  }
}

