package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAccountOpts extends js.Object {
  /**
    * Account name
    */
  var name: js.UndefOr[String] = js.undefined
}

object UpdateAccountOpts {
  @scala.inline
  def apply(name: String = null): UpdateAccountOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountOpts]
  }
}

