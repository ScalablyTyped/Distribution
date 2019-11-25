package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserOpts extends js.Object {
  /**
    * User’s name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Local currency used to display amounts converted from BTC
    */
  var native_currency: js.UndefOr[String] = js.undefined
  /**
    * Time zone
    */
  var time_zone: js.UndefOr[String] = js.undefined
}

object UpdateUserOpts {
  @scala.inline
  def apply(name: String = null, native_currency: String = null, time_zone: String = null): UpdateUserOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (native_currency != null) __obj.updateDynamic("native_currency")(native_currency.asInstanceOf[js.Any])
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserOpts]
  }
}

