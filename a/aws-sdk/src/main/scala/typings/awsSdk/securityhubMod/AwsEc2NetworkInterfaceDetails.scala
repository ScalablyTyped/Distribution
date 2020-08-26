package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2NetworkInterfaceDetails extends js.Object {
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Security groups for the network interface.
    */
  var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList] = js.native
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
}

object AwsEc2NetworkInterfaceDetails {
  @scala.inline
  def apply(): AwsEc2NetworkInterfaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceDetails]
  }
  @scala.inline
  implicit class AwsEc2NetworkInterfaceDetailsOps[Self <: AwsEc2NetworkInterfaceDetails] (val x: Self) extends AnyVal {
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
    def setAttachment(value: AwsEc2NetworkInterfaceAttachment): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("Attachment", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: NonEmptyString): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: AwsEc2NetworkInterfaceSecurityGroup*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: AwsEc2NetworkInterfaceSecurityGroupList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setSourceDestCheck(value: Boolean): Self = this.set("SourceDestCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("SourceDestCheck", js.undefined)
  }
  
}

