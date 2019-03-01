package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserOpts extends js.Object {
  /**
    * User’s name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Local currency used to display amounts converted from BTC
    */
  var native_currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time zone
    */
  var time_zone: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateUserOpts {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    native_currency: java.lang.String = null,
    time_zone: java.lang.String = null
  ): UpdateUserOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (native_currency != null) __obj.updateDynamic("native_currency")(native_currency)
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone)
    __obj.asInstanceOf[UpdateUserOpts]
  }
}

