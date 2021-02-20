package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupInput extends StObject {
  
  /**
    * The name or the ARN of the resource group to retrieve.
    */
  var Group: js.UndefOr[GroupString] = js.native
  
  /**
    * Don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupName] = js.native
}
object GetGroupInput {
  
  @scala.inline
  def apply(): GetGroupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupInput]
  }
  
  @scala.inline
  implicit class GetGroupInputMutableBuilder[Self <: GetGroupInput] (val x: Self) extends AnyVal {
    
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
