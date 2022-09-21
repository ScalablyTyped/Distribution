package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticIp extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the static IP (e.g., arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The instance where the static IP is attached (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var attachedTo: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The timestamp when the static IP was created (e.g., 1479735304.222).
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The static IP address.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * A Boolean value indicating whether the static IP is attached.
    */
  var isAttached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The region and Availability Zone where the static IP was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the static IP (e.g., StaticIP-Ohio-EXAMPLE).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The resource type (usually StaticIp).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
}
object StaticIp {
  
  inline def apply(): StaticIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIp]
  }
  
  extension [Self <: StaticIp](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAttachedTo(value: ResourceName): Self = StObject.set(x, "attachedTo", value.asInstanceOf[js.Any])
    
    inline def setAttachedToUndefined: Self = StObject.set(x, "attachedTo", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setIsAttached(value: Boolean): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    inline def setIsAttachedUndefined: Self = StObject.set(x, "isAttached", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
  }
}
