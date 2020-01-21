package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  /**
    * 2-letter country code
    */
  var code: String
  /**
    * Country name
    */
  var name: String
}

object Country {
  @scala.inline
  def apply(code: String, name: String): Country = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Country]
  }
}

