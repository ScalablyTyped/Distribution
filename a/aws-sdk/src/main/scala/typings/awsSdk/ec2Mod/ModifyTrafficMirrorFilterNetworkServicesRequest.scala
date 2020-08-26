package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterNetworkServicesRequest extends js.Object {
  /**
    * The network service, for example Amazon DNS, that you want to mirror.
    */
  var AddNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The network service, for example Amazon DNS, that you no longer want to mirror.
    */
  var RemoveNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: typings.awsSdk.ec2Mod.TrafficMirrorFilterId = js.native
}

object ModifyTrafficMirrorFilterNetworkServicesRequest {
  @scala.inline
  def apply(TrafficMirrorFilterId: TrafficMirrorFilterId): ModifyTrafficMirrorFilterNetworkServicesRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesRequest]
  }
  @scala.inline
  implicit class ModifyTrafficMirrorFilterNetworkServicesRequestOps[Self <: ModifyTrafficMirrorFilterNetworkServicesRequest] (val x: Self) extends AnyVal {
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
    def setTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = this.set("TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddNetworkServicesVarargs(value: TrafficMirrorNetworkService*): Self = this.set("AddNetworkServices", js.Array(value :_*))
    @scala.inline
    def setAddNetworkServices(value: TrafficMirrorNetworkServiceList): Self = this.set("AddNetworkServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddNetworkServices: Self = this.set("AddNetworkServices", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setRemoveNetworkServicesVarargs(value: TrafficMirrorNetworkService*): Self = this.set("RemoveNetworkServices", js.Array(value :_*))
    @scala.inline
    def setRemoveNetworkServices(value: TrafficMirrorNetworkServiceList): Self = this.set("RemoveNetworkServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveNetworkServices: Self = this.set("RemoveNetworkServices", js.undefined)
  }
  
}

