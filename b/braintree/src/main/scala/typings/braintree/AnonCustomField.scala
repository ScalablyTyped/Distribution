package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomField extends js.Object {
  var customField: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
}

object AnonCustomField {
  @scala.inline
  def apply(customField: String = null, description: String = null): AnonCustomField = {
    val __obj = js.Dynamic.literal()
    if (customField != null) __obj.updateDynamic("customField")(customField.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomField]
  }
}

