package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityMailFromDomainAttributesResponse extends StObject {
  
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
  implicit class GetIdentityMailFromDomainAttributesResponseMutableBuilder[Self <: GetIdentityMailFromDomainAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMailFromDomainAttributes(value: MailFromDomainAttributes): Self = StObject.set(x, "MailFromDomainAttributes", value.asInstanceOf[js.Any])
  }
}
