package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddInstanceGroupsOutput extends StObject {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Instance group IDs of the newly created instance groups.
    */
  var InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.undefined
  
  /**
    * The job flow ID in which the instance groups are added.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object AddInstanceGroupsOutput {
  
  inline def apply(): AddInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddInstanceGroupsOutput]
  }
  
  extension [Self <: AddInstanceGroupsOutput](x: Self) {
    
    inline def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setInstanceGroupIds(value: InstanceGroupIdsList): Self = StObject.set(x, "InstanceGroupIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupIdsUndefined: Self = StObject.set(x, "InstanceGroupIds", js.undefined)
    
    inline def setInstanceGroupIdsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "InstanceGroupIds", js.Array(value :_*))
    
    inline def setJobFlowId(value: XmlStringMaxLen256): Self = StObject.set(x, "JobFlowId", value.asInstanceOf[js.Any])
    
    inline def setJobFlowIdUndefined: Self = StObject.set(x, "JobFlowId", js.undefined)
  }
}
