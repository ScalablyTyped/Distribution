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
    * The timestamp when the instance was created (e.g., 1479734909.17).
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
  def apply(
    addOns: AddOnList = null,
    arn: NonEmptyString = null,
    blueprintId: NonEmptyString = null,
    blueprintName: NonEmptyString = null,
    bundleId: NonEmptyString = null,
    createdAt: IsoDate = null,
    hardware: InstanceHardware = null,
    ipv6Address: IpV6Address = null,
    isStaticIp: js.UndefOr[Boolean] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    networking: InstanceNetworking = null,
    privateIpAddress: IpAddress = null,
    publicIpAddress: IpAddress = null,
    resourceType: ResourceType = null,
    sshKeyName: ResourceName = null,
    state: InstanceState = null,
    supportCode: String = null,
    tags: TagList = null,
    username: NonEmptyString = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (addOns != null) __obj.updateDynamic("addOns")(addOns.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (blueprintId != null) __obj.updateDynamic("blueprintId")(blueprintId.asInstanceOf[js.Any])
    if (blueprintName != null) __obj.updateDynamic("blueprintName")(blueprintName.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (hardware != null) __obj.updateDynamic("hardware")(hardware.asInstanceOf[js.Any])
    if (ipv6Address != null) __obj.updateDynamic("ipv6Address")(ipv6Address.asInstanceOf[js.Any])
    if (!js.isUndefined(isStaticIp)) __obj.updateDynamic("isStaticIp")(isStaticIp.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networking != null) __obj.updateDynamic("networking")(networking.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (publicIpAddress != null) __obj.updateDynamic("publicIpAddress")(publicIpAddress.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sshKeyName != null) __obj.updateDynamic("sshKeyName")(sshKeyName.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

