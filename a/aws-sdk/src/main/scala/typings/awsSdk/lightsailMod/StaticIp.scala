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
  def apply(): StaticIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIp]
  }
  @scala.inline
  implicit class StaticIpOps[Self <: StaticIp] (val x: Self) extends AnyVal {
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
    def setAttachedTo(value: ResourceName): Self = this.set("attachedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedTo: Self = this.set("attachedTo", js.undefined)
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setIsAttached(value: Boolean): Self = this.set("isAttached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAttached: Self = this.set("isAttached", js.undefined)
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
  }
  
}

