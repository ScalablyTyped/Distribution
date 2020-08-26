package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * An array of objects representing the add-ons enabled on the instance.
    */
  var addOns: js.UndefOr[AddOnList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the instance (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The blueprint ID (e.g., os_amlinux_2016_03).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var blueprintName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The bundle for the instance (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the instance was created (e.g., 1479734909.17) in Unix time format.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The size of the vCPU and the amount of RAM for the instance.
    */
  var hardware: js.UndefOr[InstanceHardware] = js.native
  /**
    * The IPv6 address of the instance.
    */
  var ipv6Address: js.UndefOr[IpV6Address] = js.native
  /**
    * A Boolean value indicating whether this instance has a static IP assigned to it.
    */
  var isStaticIp: js.UndefOr[Boolean] = js.native
  /**
    * The region name and Availability Zone where the instance is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name the user gave the instance (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * Information about the public ports and monthly data transfer rates for the instance.
    */
  var networking: js.UndefOr[InstanceNetworking] = js.native
  /**
    * The private IP address of the instance.
    */
  var privateIpAddress: js.UndefOr[IpAddress] = js.native
  /**
    * The public IP address of the instance.
    */
  var publicIpAddress: js.UndefOr[IpAddress] = js.native
  /**
    * The type of resource (usually Instance).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The name of the SSH key being used to connect to the instance (e.g., LightsailDefaultKeyPair).
    */
  var sshKeyName: js.UndefOr[ResourceName] = js.native
  /**
    * The status code and the state (e.g., running) for the instance.
    */
  var state: js.UndefOr[InstanceState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The user name for connecting to the instance (e.g., ec2-user).
    */
  var username: js.UndefOr[NonEmptyString] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setAddOnsVarargs(value: AddOn*): Self = this.set("addOns", js.Array(value :_*))
    @scala.inline
    def setAddOns(value: AddOnList): Self = this.set("addOns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOns: Self = this.set("addOns", js.undefined)
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setBlueprintId(value: NonEmptyString): Self = this.set("blueprintId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueprintId: Self = this.set("blueprintId", js.undefined)
    @scala.inline
    def setBlueprintName(value: NonEmptyString): Self = this.set("blueprintName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueprintName: Self = this.set("blueprintName", js.undefined)
    @scala.inline
    def setBundleId(value: NonEmptyString): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setHardware(value: InstanceHardware): Self = this.set("hardware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardware: Self = this.set("hardware", js.undefined)
    @scala.inline
    def setIpv6Address(value: IpV6Address): Self = this.set("ipv6Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Address: Self = this.set("ipv6Address", js.undefined)
    @scala.inline
    def setIsStaticIp(value: Boolean): Self = this.set("isStaticIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStaticIp: Self = this.set("isStaticIp", js.undefined)
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworking(value: InstanceNetworking): Self = this.set("networking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworking: Self = this.set("networking", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: IpAddress): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    @scala.inline
    def setPublicIpAddress(value: IpAddress): Self = this.set("publicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpAddress: Self = this.set("publicIpAddress", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setSshKeyName(value: ResourceName): Self = this.set("sshKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshKeyName: Self = this.set("sshKeyName", js.undefined)
    @scala.inline
    def setState(value: InstanceState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUsername(value: NonEmptyString): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

