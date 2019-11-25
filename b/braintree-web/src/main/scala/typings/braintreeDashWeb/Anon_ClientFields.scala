package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.Client
import typings.braintreeDashWeb.braintreeDashWebMod.HostedFieldFieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientFields extends js.Object {
  var client: Client
  var fields: HostedFieldFieldOptions
  var styles: js.Any
}

object Anon_ClientFields {
  @scala.inline
  def apply(client: Client, fields: HostedFieldFieldOptions, styles: js.Any): Anon_ClientFields = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientFields]
  }
}

