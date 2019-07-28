package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomField extends js.Object {
  var customField: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
}

object Anon_CustomField {
  @scala.inline
  def apply(customField: String = null, description: String = null): Anon_CustomField = {
    val __obj = js.Dynamic.literal()
    if (customField != null) __obj.updateDynamic("customField")(customField)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_CustomField]
  }
}

