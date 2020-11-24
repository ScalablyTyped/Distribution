package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetIdentityMailFromDomainAttributesResponseOps[Self <: GetIdentityMailFromDomainAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMailFromDomainAttributes(value: MailFromDomainAttributes): Self = this.set("MailFromDomainAttributes", value.asInstanceOf[js.Any])
  }
}
