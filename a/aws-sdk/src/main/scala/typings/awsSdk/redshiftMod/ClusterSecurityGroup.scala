package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSecurityGroup extends StObject {
  
  /**
    * The name of the cluster security group to which the operation was applied.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  
  /**
    * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security group.
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  
  /**
    * The list of tags for the cluster security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ClusterSecurityGroup {
  
  @scala.inline
  def apply(): ClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroup]
  }
  
  @scala.inline
  implicit class ClusterSecurityGroupMutableBuilder[Self <: ClusterSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupNameUndefined: Self = StObject.set(x, "ClusterSecurityGroupName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = StObject.set(x, "EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupsUndefined: Self = StObject.set(x, "EC2SecurityGroups", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = StObject.set(x, "EC2SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setIPRanges(value: IPRangeList): Self = StObject.set(x, "IPRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPRangesUndefined: Self = StObject.set(x, "IPRanges", js.undefined)
    
    @scala.inline
    def setIPRangesVarargs(value: IPRange*): Self = StObject.set(x, "IPRanges", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
