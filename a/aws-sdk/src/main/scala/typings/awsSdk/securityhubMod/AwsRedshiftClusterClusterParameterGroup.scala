package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterClusterParameterGroup extends js.Object {
  
  /**
    * The list of parameter statuses.
    */
  var ClusterParameterStatusList: js.UndefOr[AwsRedshiftClusterClusterParameterStatusList] = js.native
  
  /**
    * The status of updates to the parameters.
    */
  var ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterClusterParameterGroup {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterParameterGroup]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterParameterGroupOps[Self <: AwsRedshiftClusterClusterParameterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterParameterStatusListVarargs(value: AwsRedshiftClusterClusterParameterStatus*): Self = this.set("ClusterParameterStatusList", js.Array(value :_*))
    
    @scala.inline
    def setClusterParameterStatusList(value: AwsRedshiftClusterClusterParameterStatusList): Self = this.set("ClusterParameterStatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterParameterStatusList: Self = this.set("ClusterParameterStatusList", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: NonEmptyString): Self = this.set("ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("ParameterApplyStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: NonEmptyString): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupName: Self = this.set("ParameterGroupName", js.undefined)
  }
}
