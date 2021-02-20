package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGroupInput extends StObject {
  
  /**
    * A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. A configuration is an array of GroupConfigurationItem elements.  You can specify either a Configuration or a ResourceQuery in a group, but not both. 
    */
  var Configuration: js.UndefOr[GroupConfigurationList] = js.native
  
  /**
    * The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores, periods, and spaces.
    */
  var Description: js.UndefOr[typings.awsSdk.resourcegroupsMod.Description] = js.native
  
  /**
    * The name of the group, which is the identifier of the group in other operations. You can't change the name of a resource group after you create it. A resource group name can consist of letters, numbers, hyphens, periods, and underscores. The name cannot start with AWS or aws; these are reserved. A resource group name must be unique within each AWS Region in your AWS account.
    */
  var Name: GroupName = js.native
  
  /**
    * The resource query that determines which AWS resources are members of this group.  You can specify either a ResourceQuery or a Configuration, but not both. 
    */
  var ResourceQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceQuery] = js.native
  
  /**
    * The tags to add to the group. A tag is key-value pair string.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}
object CreateGroupInput {
  
  @scala.inline
  def apply(Name: GroupName): CreateGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupInput]
  }
  
  @scala.inline
  implicit class CreateGroupInputMutableBuilder[Self <: CreateGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: GroupConfigurationList): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setConfigurationVarargs(value: GroupConfigurationItem*): Self = StObject.set(x, "Configuration", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceQueryUndefined: Self = StObject.set(x, "ResourceQuery", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
