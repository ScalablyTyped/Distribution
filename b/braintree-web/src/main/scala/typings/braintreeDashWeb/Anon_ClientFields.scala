package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.Client
import typings.braintreeDashWeb.braintreeDashWebMod.HostedFieldFieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientFields extends js.Object {
  var client: Client
  var fields: HostedFieldFieldOptions
  var styles: js.UndefOr[js.Any] = js.undefined
}

object Anon_ClientFields {
  @scala.inline
  def apply(client: Client, fields: HostedFieldFieldOptions, styles: js.Any = null): Anon_ClientFields = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientFields]
  }
}

