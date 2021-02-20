package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddInstanceGroupsOutput extends StObject {
  
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
  implicit class AddInstanceGroupsOutputMutableBuilder[Self <: AddInstanceGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setInstanceGroupIds(value: InstanceGroupIdsList): Self = StObject.set(x, "InstanceGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupIdsUndefined: Self = StObject.set(x, "InstanceGroupIds", js.undefined)
    
    @scala.inline
    def setInstanceGroupIdsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "InstanceGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowIdUndefined: Self = StObject.set(x, "JobFlowId", js.undefined)
  }
}
