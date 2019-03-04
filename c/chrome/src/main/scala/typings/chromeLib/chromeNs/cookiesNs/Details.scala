package typings
package chromeLib.chromeNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var name: java.lang.String
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Details {
  @scala.inline
  def apply(name: java.lang.String, url: java.lang.String, storeId: java.lang.String = null): Details = {
    val __obj = js.Dynamic.literal(name = name, url = url)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    __obj.asInstanceOf[Details]
  }
}

