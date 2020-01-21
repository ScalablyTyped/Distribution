package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityMailFromDomainAttributesResponse extends js.Object {
  /**
    * A map of identities to custom MAIL FROM attributes.
    */
  var MailFromDomainAttributes: typings.awsSdk.sesMod.MailFromDomainAttributes = js.native
}

object GetIdentityMailFromDomainAttributesResponse {
  @scala.inline
  def apply(MailFromDomainAttributes: MailFromDomainAttributes): GetIdentityMailFromDomainAttributesResponse = {
    val __obj = js.Dynamic.literal(MailFromDomainAttributes = MailFromDomainAttributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesResponse]
  }
}

