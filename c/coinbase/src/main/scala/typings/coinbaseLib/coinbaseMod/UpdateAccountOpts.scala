package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAccountOpts extends js.Object {
  /**
    * Account name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateAccountOpts {
  @scala.inline
  def apply(name: java.lang.String = null): UpdateAccountOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateAccountOpts]
  }
}

