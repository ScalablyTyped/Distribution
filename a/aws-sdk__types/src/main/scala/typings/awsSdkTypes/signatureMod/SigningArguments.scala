package typings.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningArguments extends js.Object {
  /**
    * The date and time to be used as signature metadata. This value should be
    * a Date object, a unix (epoch) timestamp, or a string that can be
    * understood by the JavaScript `Date` constructor.If not supplied, the
    * value returned by `new Date()` will be used.
    */
  var signingDate: js.UndefOr[DateInput] = js.undefined
}

object SigningArguments {
  @scala.inline
  def apply(signingDate: DateInput = null): SigningArguments = {
    val __obj = js.Dynamic.literal()
    if (signingDate != null) __obj.updateDynamic("signingDate")(signingDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningArguments]
  }
}

