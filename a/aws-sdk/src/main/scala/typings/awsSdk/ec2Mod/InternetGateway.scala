package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternetGateway extends js.Object {
  /**
    * Any VPCs attached to the internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.native
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object InternetGateway {
  @scala.inline
  def apply(): InternetGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetGateway]
  }
  @scala.inline
  implicit class InternetGatewayOps[Self <: InternetGateway] (val x: Self) extends AnyVal {
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
    def setInternetGatewayId(value: String): Self = this.set("InternetGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternetGatewayId: Self = this.set("InternetGatewayId", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

