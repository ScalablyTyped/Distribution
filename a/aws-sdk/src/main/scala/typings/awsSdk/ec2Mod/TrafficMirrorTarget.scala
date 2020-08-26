package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorTarget extends js.Object {
  /**
    * Information about the Traffic Mirror target.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The network interface ID that is attached to the target.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer.
    */
  var NetworkLoadBalancerArn: js.UndefOr[String] = js.native
  /**
    * The ID of the account that owns the Traffic Mirror target.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the Traffic Mirror target.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.native
  /**
    * The type of Traffic Mirror target.
    */
  var Type: js.UndefOr[TrafficMirrorTargetType] = js.native
}

object TrafficMirrorTarget {
  @scala.inline
  def apply(): TrafficMirrorTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorTarget]
  }
  @scala.inline
  implicit class TrafficMirrorTargetOps[Self <: TrafficMirrorTarget] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setNetworkLoadBalancerArn(value: String): Self = this.set("NetworkLoadBalancerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkLoadBalancerArn: Self = this.set("NetworkLoadBalancerArn", js.undefined)
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
    @scala.inline
    def setTrafficMirrorTargetId(value: String): Self = this.set("TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorTargetId: Self = this.set("TrafficMirrorTargetId", js.undefined)
    @scala.inline
    def setType(value: TrafficMirrorTargetType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

