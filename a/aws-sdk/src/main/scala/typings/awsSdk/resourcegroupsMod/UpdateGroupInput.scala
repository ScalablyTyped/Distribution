package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupInput extends StObject {
  
  /**
    * The new description that you want to update the resource group with. Descriptions can contain letters, numbers, hyphens, underscores, periods, and spaces.
    */
  var Description: js.UndefOr[typings.awsSdk.resourcegroupsMod.Description] = js.undefined
  
  /**
    * The name or the ARN of the resource group to modify.
    */
  var Group: js.UndefOr[GroupString] = js.undefined
  
  /**
    * Don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupName] = js.undefined
}
object UpdateGroupInput {
  
  @scala.inline
  def apply(): UpdateGroupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupInput]
  }
  
  @scala.inline
  implicit class UpdateGroupInputMutableBuilder[Self <: UpdateGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
