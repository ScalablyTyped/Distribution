package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterParameterGroupStatus extends js.Object {
  
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
  implicit class ClusterParameterGroupStatusOps[Self <: ClusterParameterGroupStatus] (val x: Self) extends AnyVal {
    
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
    def setClusterParameterStatusListVarargs(value: ClusterParameterStatus*): Self = this.set("ClusterParameterStatusList", js.Array(value :_*))
    
    @scala.inline
    def setClusterParameterStatusList(value: ClusterParameterStatusList): Self = this.set("ClusterParameterStatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterParameterStatusList: Self = this.set("ClusterParameterStatusList", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: String): Self = this.set("ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("ParameterApplyStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupName: Self = this.set("ParameterGroupName", js.undefined)
  }
}
