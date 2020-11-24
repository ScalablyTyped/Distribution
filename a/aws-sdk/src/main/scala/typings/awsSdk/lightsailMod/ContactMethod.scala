package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactMethod extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the contact method.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination of the contact method, such as an email address or a mobile phone number.
    */
  var contactEndpoint: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The timestamp when the contact method was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the contact method.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The protocol of the contact method, such as email or SMS (text messaging).
    */
  var protocol: js.UndefOr[ContactProtocol] = js.native
  
  /**
    * The Lightsail resource type (e.g., ContactMethod).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The current status of the contact method. A contact method has the following possible status:    PendingVerification - The contact method has not yet been verified, and the verification has not yet expired.    Valid - The contact method has been verified.    InValid - An attempt was made to verify the contact method, but the verification has expired.  
    */
  var status: js.UndefOr[ContactMethodStatus] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail contact method. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
}
object ContactMethod {
  
  @scala.inline
  def apply(): ContactMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactMethod]
  }
  
  @scala.inline
  implicit class ContactMethodOps[Self <: ContactMethod] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setContactEndpoint(value: NonEmptyString): Self = this.set("contactEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactEndpoint: Self = this.set("contactEndpoint", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtocol(value: ContactProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: ContactMethodStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
  }
}
