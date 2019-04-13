package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientFields extends js.Object {
  var client: braintreeDashWebLib.braintreeDashWebMod.Client
  var fields: braintreeDashWebLib.braintreeDashWebMod.HostedFieldFieldOptions
  var styles: js.Any
}

object Anon_ClientFields {
  @scala.inline
  def apply(
    client: braintreeDashWebLib.braintreeDashWebMod.Client,
    fields: braintreeDashWebLib.braintreeDashWebMod.HostedFieldFieldOptions,
    styles: js.Any
  ): Anon_ClientFields = {
    val __obj = js.Dynamic.literal(client = client, fields = fields, styles = styles)
  
    __obj.asInstanceOf[Anon_ClientFields]
  }
}

