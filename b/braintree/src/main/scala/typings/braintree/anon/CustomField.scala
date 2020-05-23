package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomField extends js.Object {
  var customField: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
}

object CustomField {
  @scala.inline
  def apply(customField: String = null, description: String = null): CustomField = {
    val __obj = js.Dynamic.literal()
    if (customField != null) __obj.updateDynamic("customField")(customField.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomField]
  }
}

