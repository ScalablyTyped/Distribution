package typings.braintreeDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var merchantIdentifier: js.UndefOr[String] = js.undefined
  var validationURL: String
}

object Anon_DisplayName {
  @scala.inline
  def apply(validationURL: String, displayName: String = null, merchantIdentifier: String = null): Anon_DisplayName = {
    val __obj = js.Dynamic.literal(validationURL = validationURL.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (merchantIdentifier != null) __obj.updateDynamic("merchantIdentifier")(merchantIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

