package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGateway extends js.Object {
  /**
    * Information about the attachment of the egress-only internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.native
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.EgressOnlyInternetGatewayId] = js.native
  /**
    * The tags assigned to the egress-only internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object EgressOnlyInternetGateway {
  @scala.inline
  def apply(): EgressOnlyInternetGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressOnlyInternetGateway]
  }
  @scala.inline
  implicit class EgressOnlyInternetGatewayOps[Self <: EgressOnlyInternetGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachmentsVarargs(value: InternetGatewayAttachment*): Self = this.set("Attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: InternetGatewayAttachmentList): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("Attachments", js.undefined)
    @scala.inline
    def setEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = this.set("EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressOnlyInternetGatewayId: Self = this.set("EgressOnlyInternetGatewayId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

