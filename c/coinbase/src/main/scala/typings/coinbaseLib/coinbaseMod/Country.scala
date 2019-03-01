package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  /**
    * 2-letter country code
    */
  var code: java.lang.String
  /**
    * Country name
    */
  var name: java.lang.String
}

object Country {
  @scala.inline
  def apply(code: java.lang.String, name: java.lang.String): Country = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Country]
  }
}

