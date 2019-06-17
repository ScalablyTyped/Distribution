package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var dialCode: java.lang.String
  var id: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 241 */ js.Any
  var label: java.lang.String
}

object Country {
  @scala.inline
  def apply(
    dialCode: java.lang.String,
    id: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 241 */ js.Any,
    label: java.lang.String
  ): Country = {
    val __obj = js.Dynamic.literal(dialCode = dialCode, id = id, label = label)
  
    __obj.asInstanceOf[Country]
  }
}

