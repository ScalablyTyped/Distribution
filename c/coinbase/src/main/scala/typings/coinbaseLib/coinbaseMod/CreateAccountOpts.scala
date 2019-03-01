package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountOpts extends js.Object {
  /**
    * Account name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object CreateAccountOpts {
  @scala.inline
  def apply(name: java.lang.String = null): CreateAccountOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CreateAccountOpts]
  }
}

