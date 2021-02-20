package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterParameterGroupStatus extends StObject {
  
  /**
    * The list of parameter statuses.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ClusterParameterStatusList: js.UndefOr[typings.awsSdk.redshiftMod.ClusterParameterStatusList] = js.native
  
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}
object ClusterParameterGroupStatus {
  
  @scala.inline
  def apply(): ClusterParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupStatus]
  }
  
  @scala.inline
  implicit class ClusterParameterGroupStatusMutableBuilder[Self <: ClusterParameterGroupStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterParameterStatusList(value: ClusterParameterStatusList): Self = StObject.set(x, "ClusterParameterStatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterParameterStatusListUndefined: Self = StObject.set(x, "ClusterParameterStatusList", js.undefined)
    
    @scala.inline
    def setClusterParameterStatusListVarargs(value: ClusterParameterStatus*): Self = StObject.set(x, "ClusterParameterStatusList", js.Array(value :_*))
    
    @scala.inline
    def setParameterApplyStatus(value: String): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
  }
}
