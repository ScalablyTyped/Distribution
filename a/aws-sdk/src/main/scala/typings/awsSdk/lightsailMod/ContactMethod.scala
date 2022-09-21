package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactMethod extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact method.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The destination of the contact method, such as an email address or a mobile phone number.
    */
  var contactEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp when the contact method was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that describes the location of the contact method, such as the Amazon Web Services Region and Availability Zone.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the contact method.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The protocol of the contact method, such as email or SMS (text messaging).
    */
  var protocol: js.UndefOr[ContactProtocol] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., ContactMethod).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The current status of the contact method. A contact method has the following possible status:    PendingVerification - The contact method has not yet been verified, and the verification has not yet expired.    Valid - The contact method has been verified.    InValid - An attempt was made to verify the contact method, but the verification has expired.  
    */
  var status: js.UndefOr[ContactMethodStatus] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail contact method. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
}
object ContactMethod {
  
  inline def apply(): ContactMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactMethod]
  }
  
  extension [Self <: ContactMethod](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setContactEndpoint(value: NonEmptyString): Self = StObject.set(x, "contactEndpoint", value.asInstanceOf[js.Any])
    
    inline def setContactEndpointUndefined: Self = StObject.set(x, "contactEndpoint", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocol(value: ContactProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: ContactMethodStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
  }
}
