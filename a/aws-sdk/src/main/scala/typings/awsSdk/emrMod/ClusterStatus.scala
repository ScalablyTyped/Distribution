package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterStatus extends js.Object {
  
  /**
    * The current state of the cluster.
    */
  var State: js.UndefOr[ClusterState] = js.native
  
  /**
    * The reason for the cluster status change.
    */
  var StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.native
  
  /**
    * A timeline that represents the status of a cluster over the lifetime of the cluster.
    */
  var Timeline: js.UndefOr[ClusterTimeline] = js.native
}
object ClusterStatus {
  
  @scala.inline
  def apply(): ClusterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatus]
  }
  
  @scala.inline
  implicit class ClusterStatusOps[Self <: ClusterStatus] (val x: Self) extends AnyVal {
    
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
    def setState(value: ClusterState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateChangeReason(value: ClusterStateChangeReason): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    
    @scala.inline
    def setTimeline(value: ClusterTimeline): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
  }
}
