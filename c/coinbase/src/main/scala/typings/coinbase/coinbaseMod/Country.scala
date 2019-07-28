package typings.coinbase.coinbaseMod

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
    val __obj = js.Dynamic.literal(code = code, name = name)
  
    __obj.asInstanceOf[Country]
  }
}

