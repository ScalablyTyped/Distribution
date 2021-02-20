package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UngroupResourcesInput extends StObject {
  
  /**
    * The name or the ARN of the resource group from which to remove the resources.
    */
  var Group: GroupString = js.native
  
  /**
    * The ARNs of the resources to be removed from the group.
    */
  var ResourceArns: ResourceArnList = js.native
}
object UngroupResourcesInput {
  
  @scala.inline
  def apply(Group: GroupString, ResourceArns: ResourceArnList): UngroupResourcesInput = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[UngroupResourcesInput]
  }
  
  @scala.inline
  implicit class UngroupResourcesInputMutableBuilder[Self <: UngroupResourcesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
  }
}
