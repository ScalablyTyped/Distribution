package typings.braintreeWeb

import typings.braintreeWeb.mod.Client_
import typings.braintreeWeb.mod.HostedFieldFieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var authorization: js.UndefOr[String] = js.undefined
  var client: js.UndefOr[Client_] = js.undefined
  var fields: HostedFieldFieldOptions
  var styles: js.UndefOr[js.Any] = js.undefined
}

object AnonFields {
  @scala.inline
  def apply(
    fields: HostedFieldFieldOptions,
    authorization: String = null,
    client: Client_ = null,
    styles: js.Any = null
  ): AnonFields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

