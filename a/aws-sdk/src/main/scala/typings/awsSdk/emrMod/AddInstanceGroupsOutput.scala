package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddInstanceGroupsOutput extends js.Object {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  
  /**
    * Instance group IDs of the newly created instance groups.
    */
  var InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.native
  
  /**
    * The job flow ID in which the instance groups are added.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.native
}
object AddInstanceGroupsOutput {
  
  @scala.inline
  def apply(): AddInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddInstanceGroupsOutput]
  }
  
  @scala.inline
  implicit class AddInstanceGroupsOutputOps[Self <: AddInstanceGroupsOutput] (val x: Self) extends AnyVal {
    
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
    def setClusterArn(value: ArnType): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    
    @scala.inline
    def setInstanceGroupIdsVarargs(value: XmlStringMaxLen256*): Self = this.set("InstanceGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setInstanceGroupIds(value: InstanceGroupIdsList): Self = this.set("InstanceGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroupIds: Self = this.set("InstanceGroupIds", js.undefined)
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = this.set("JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobFlowId: Self = this.set("JobFlowId", js.undefined)
  }
}
