package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterClusterSecurityGroup extends js.Object {
  
  /**
    * The name of the cluster security group.
    */
  var ClusterSecurityGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the cluster security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterClusterSecurityGroup {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterSecurityGroup]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterSecurityGroupOps[Self <: AwsRedshiftClusterClusterSecurityGroup] (val x: Self) extends AnyVal {
    
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
    def setClusterSecurityGroupName(value: NonEmptyString): Self = this.set("ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecurityGroupName: Self = this.set("ClusterSecurityGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
