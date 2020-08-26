package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGateway extends js.Object {
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account ID that owns the local gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The state of the local gateway.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the local gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LocalGateway {
  @scala.inline
  def apply(): LocalGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGateway]
  }
  @scala.inline
  implicit class LocalGatewayOps[Self <: LocalGateway] (val x: Self) extends AnyVal {
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
    def setLocalGatewayId(value: LocalGatewayId): Self = this.set("LocalGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("LocalGatewayId", js.undefined)
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

