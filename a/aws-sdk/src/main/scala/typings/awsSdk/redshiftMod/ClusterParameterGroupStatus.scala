package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterParameterGroupStatus extends StObject {
  
  /**
    * The list of parameter statuses.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ClusterParameterStatusList: js.UndefOr[typings.awsSdk.redshiftMod.ClusterParameterStatusList] = js.undefined
  
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
}
object ClusterParameterGroupStatus {
  
  inline def apply(): ClusterParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupStatus]
  }
  
  extension [Self <: ClusterParameterGroupStatus](x: Self) {
    
    inline def setClusterParameterStatusList(value: ClusterParameterStatusList): Self = StObject.set(x, "ClusterParameterStatusList", value.asInstanceOf[js.Any])
    
    inline def setClusterParameterStatusListUndefined: Self = StObject.set(x, "ClusterParameterStatusList", js.undefined)
    
    inline def setClusterParameterStatusListVarargs(value: ClusterParameterStatus*): Self = StObject.set(x, "ClusterParameterStatusList", js.Array(value*))
    
    inline def setParameterApplyStatus(value: String): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
  }
}
