package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIp extends js.Object {
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
  def apply(
    arn: NonEmptyString = null,
    attachedTo: ResourceName = null,
    createdAt: IsoDate = null,
    ipAddress: IpAddress = null,
    isAttached: js.UndefOr[Boolean] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    resourceType: ResourceType = null,
    supportCode: String = null
  ): StaticIp = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (attachedTo != null) __obj.updateDynamic("attachedTo")(attachedTo.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isAttached)) __obj.updateDynamic("isAttached")(isAttached.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIp]
  }
}

