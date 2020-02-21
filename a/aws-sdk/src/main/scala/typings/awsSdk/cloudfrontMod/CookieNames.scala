package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieNames extends js.Object {
  /**
    * A complex type that contains one Name element for each cookie that you want CloudFront to forward to the origin for this cache behavior. It must contain the same number of items that is specified in the Quantity field. When you set Forward = whitelist (in the CookiePreferences object), this field must contain at least one item.
    */
  var Items: js.UndefOr[CookieNameList] = js.native
  /**
    * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior. The value must equal the number of items that are in the Items field. When you set Forward = whitelist (in the CookiePreferences object), this value must be 1 or higher.
    */
  var Quantity: integer = js.native
}

object CookieNames {
  @scala.inline
  def apply(Quantity: integer, Items: CookieNameList = null): CookieNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieNames]
  }
}

