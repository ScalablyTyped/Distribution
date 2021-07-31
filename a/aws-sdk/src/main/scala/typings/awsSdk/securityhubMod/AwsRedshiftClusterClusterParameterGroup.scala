package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterParameterGroup extends StObject {
  
  /**
    * The list of parameter statuses.
    */
  var ClusterParameterStatusList: js.UndefOr[AwsRedshiftClusterClusterParameterStatusList] = js.undefined
  
  /**
    * The status of updates to the parameters.
    */
  var ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterParameterGroup {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterParameterGroup]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterParameterGroupMutableBuilder[Self <: AwsRedshiftClusterClusterParameterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterParameterStatusList(value: AwsRedshiftClusterClusterParameterStatusList): Self = StObject.set(x, "ClusterParameterStatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterParameterStatusListUndefined: Self = StObject.set(x, "ClusterParameterStatusList", js.undefined)
    
    @scala.inline
    def setClusterParameterStatusListVarargs(value: AwsRedshiftClusterClusterParameterStatus*): Self = StObject.set(x, "ClusterParameterStatusList", js.Array(value :_*))
    
    @scala.inline
    def setParameterApplyStatus(value: NonEmptyString): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: NonEmptyString): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
  }
}
