package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var merchantIdentifier: js.UndefOr[String] = js.undefined
  var validationURL: String
}

object AnonDisplayName {
  @scala.inline
  def apply(validationURL: String, displayName: String = null, merchantIdentifier: String = null): AnonDisplayName = {
    val __obj = js.Dynamic.literal(validationURL = validationURL.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (merchantIdentifier != null) __obj.updateDynamic("merchantIdentifier")(merchantIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
}

