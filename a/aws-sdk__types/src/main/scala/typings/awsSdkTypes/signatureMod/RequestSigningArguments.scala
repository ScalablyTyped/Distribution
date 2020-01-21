package typings.awsSdkTypes.signatureMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSigningArguments extends SigningArguments {
  /**
    * A set of strings whose members represents headers that cannot be signed.
    * All headers in the provided request will have their names converted to
    * lower case and then checked for existence in the unsignableHeaders set.
    */
  var unsignableHeaders: js.UndefOr[Set[String]] = js.undefined
}

object RequestSigningArguments {
  @scala.inline
  def apply(signingDate: DateInput = null, unsignableHeaders: Set[String] = null): RequestSigningArguments = {
    val __obj = js.Dynamic.literal()
    if (signingDate != null) __obj.updateDynamic("signingDate")(signingDate.asInstanceOf[js.Any])
    if (unsignableHeaders != null) __obj.updateDynamic("unsignableHeaders")(unsignableHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSigningArguments]
  }
}

