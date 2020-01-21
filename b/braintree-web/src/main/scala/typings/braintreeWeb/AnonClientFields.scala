package typings.braintreeWeb

import typings.braintreeWeb.mod.Client_
import typings.braintreeWeb.mod.HostedFieldFieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientFields extends js.Object {
  var client: Client_
  var fields: HostedFieldFieldOptions
  var styles: js.UndefOr[js.Any] = js.undefined
}

object AnonClientFields {
  @scala.inline
  def apply(client: Client_, fields: HostedFieldFieldOptions, styles: js.Any = null): AnonClientFields = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientFields]
  }
}

