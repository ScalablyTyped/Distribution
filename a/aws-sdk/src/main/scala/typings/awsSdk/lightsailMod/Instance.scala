package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * An array of objects representing the add-ons enabled on the instance.
    */
  var addOns: js.UndefOr[AddOnList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the instance (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The blueprint ID (e.g., os_amlinux_2016_03).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var blueprintName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The bundle for the instance (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp when the instance was created (e.g., 1479734909.17) in Unix time format.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * The size of the vCPU and the amount of RAM for the instance.
    */
  var hardware: js.UndefOr[InstanceHardware] = js.undefined
  
  /**
    * The IPv6 address of the instance.
    */
  var ipv6Address: js.UndefOr[IpV6Address] = js.undefined
  
  /**
    * A Boolean value indicating whether this instance has a static IP assigned to it.
    */
  var isStaticIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The region name and Availability Zone where the instance is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name the user gave the instance (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Information about the public ports and monthly data transfer rates for the instance.
    */
  var networking: js.UndefOr[InstanceNetworking] = js.undefined
  
  /**
    * The private IP address of the instance.
    */
  var privateIpAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The public IP address of the instance.
    */
  var publicIpAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The type of resource (usually Instance).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The name of the SSH key being used to connect to the instance (e.g., LightsailDefaultKeyPair).
    */
  var sshKeyName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The status code and the state (e.g., running) for the instance.
    */
  var state: js.UndefOr[InstanceState] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The user name for connecting to the instance (e.g., ec2-user).
    */
  var username: js.UndefOr[NonEmptyString] = js.undefined
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOns(value: AddOnList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    @scala.inline
    def setAddOnsVarargs(value: AddOn*): Self = StObject.set(x, "addOns", js.Array(value :_*))
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBlueprintId(value: NonEmptyString): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueprintIdUndefined: Self = StObject.set(x, "blueprintId", js.undefined)
    
    @scala.inline
    def setBlueprintName(value: NonEmptyString): Self = StObject.set(x, "blueprintName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueprintNameUndefined: Self = StObject.set(x, "blueprintName", js.undefined)
    
    @scala.inline
    def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setHardware(value: InstanceHardware): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareUndefined: Self = StObject.set(x, "hardware", js.undefined)
    
    @scala.inline
    def setIpv6Address(value: IpV6Address): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
    
    @scala.inline
    def setIsStaticIp(value: Boolean): Self = StObject.set(x, "isStaticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStaticIpUndefined: Self = StObject.set(x, "isStaticIp", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworking(value: InstanceNetworking): Self = StObject.set(x, "networking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkingUndefined: Self = StObject.set(x, "networking", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: IpAddress): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIpAddress(value: IpAddress): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSshKeyName(value: ResourceName): Self = StObject.set(x, "sshKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyNameUndefined: Self = StObject.set(x, "sshKeyName", js.undefined)
    
    @scala.inline
    def setState(value: InstanceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: NonEmptyString): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
