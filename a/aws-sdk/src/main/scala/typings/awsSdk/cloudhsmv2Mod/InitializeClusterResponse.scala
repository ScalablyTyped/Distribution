package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeClusterResponse extends js.Object {
  
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.native
  
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.StateMessage] = js.native
}
object InitializeClusterResponse {
  
  @scala.inline
  def apply(): InitializeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeClusterResponse]
  }
  
  @scala.inline
  implicit class InitializeClusterResponseOps[Self <: InitializeClusterResponse] (val x: Self) extends AnyVal {
    
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
    def setStateMessage(value: StateMessage): Self = this.set("StateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateMessage: Self = this.set("StateMessage", js.undefined)
  }
}
