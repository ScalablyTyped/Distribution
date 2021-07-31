package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterSecurityGroup extends StObject {
  
  /**
    * The name of the cluster security group.
    */
  var ClusterSecurityGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the cluster security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterSecurityGroup {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterSecurityGroup]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterSecurityGroupMutableBuilder[Self <: AwsRedshiftClusterClusterSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroupName(value: NonEmptyString): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupNameUndefined: Self = StObject.set(x, "ClusterSecurityGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
