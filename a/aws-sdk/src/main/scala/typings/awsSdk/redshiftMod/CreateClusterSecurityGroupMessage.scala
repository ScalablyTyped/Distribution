package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSecurityGroupMessage extends StObject {
  
  /**
    * The name for the security group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all security groups that are created by your AWS account.   Example: examplesecuritygroup 
    */
  var ClusterSecurityGroupName: String
  
  /**
    * A description for the security group.
    */
  var Description: String
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateClusterSecurityGroupMessage {
  
  @scala.inline
  def apply(ClusterSecurityGroupName: String, Description: String): CreateClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class CreateClusterSecurityGroupMessageMutableBuilder[Self <: CreateClusterSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
