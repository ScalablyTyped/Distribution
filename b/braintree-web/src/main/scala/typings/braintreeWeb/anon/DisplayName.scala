package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var merchantIdentifier: js.UndefOr[String] = js.undefined
  var validationURL: String
}

object DisplayName {
  @scala.inline
  def apply(validationURL: String, displayName: String = null, merchantIdentifier: String = null): DisplayName = {
    val __obj = js.Dynamic.literal(validationURL = validationURL.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (merchantIdentifier != null) __obj.updateDynamic("merchantIdentifier")(merchantIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

