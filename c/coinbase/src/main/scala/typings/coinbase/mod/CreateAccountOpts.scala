package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountOpts extends js.Object {
  /**
    * Account name
    */
  var name: js.UndefOr[String] = js.undefined
}

object CreateAccountOpts {
  @scala.inline
  def apply(name: String = null): CreateAccountOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOpts]
  }
}

