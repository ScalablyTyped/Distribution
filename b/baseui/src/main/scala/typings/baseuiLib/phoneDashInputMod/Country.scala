package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var dialCode: java.lang.String
  var id: java.lang.String
  var label: java.lang.String
}

object Country {
  @scala.inline
  def apply(dialCode: java.lang.String, id: java.lang.String, label: java.lang.String): Country = {
    val __obj = js.Dynamic.literal(dialCode = dialCode, id = id, label = label)
  
    __obj.asInstanceOf[Country]
  }
}

