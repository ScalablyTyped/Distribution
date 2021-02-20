package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticIp extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the static IP (e.g., arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The instance where the static IP is attached (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var attachedTo: js.UndefOr[ResourceName] = js.native
  
  /**
    * The timestamp when the static IP was created (e.g., 1479735304.222).
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The static IP address.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.native
  
  /**
    * A Boolean value indicating whether the static IP is attached.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  
  /**
    * The region and Availability Zone where the static IP was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the static IP (e.g., StaticIP-Ohio-EXAMPLE).
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The resource type (usually StaticIp).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
}
object StaticIp {
  
  @scala.inline
  def apply(): StaticIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIp]
  }
  
  @scala.inline
  implicit class StaticIpMutableBuilder[Self <: StaticIp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setAttachedTo(value: ResourceName): Self = StObject.set(x, "attachedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedToUndefined: Self = StObject.set(x, "attachedTo", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setIsAttached(value: Boolean): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttachedUndefined: Self = StObject.set(x, "isAttached", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
  }
}
