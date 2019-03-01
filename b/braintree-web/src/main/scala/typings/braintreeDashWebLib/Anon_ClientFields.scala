package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientFields extends js.Object {
  var client: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.Client
  var fields: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.HostedFieldFieldOptions
  var styles: js.Any
}

object Anon_ClientFields {
  @scala.inline
  def apply(
    client: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.Client,
    fields: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.HostedFieldFieldOptions,
    styles: js.Any
  ): Anon_ClientFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Anon_ClientFields]
  }
}

