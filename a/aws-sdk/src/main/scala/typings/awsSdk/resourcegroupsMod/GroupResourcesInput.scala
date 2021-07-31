package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupResourcesInput extends StObject {
  
  /**
    * The name or the ARN of the resource group to add resources to.
    */
  var Group: GroupString
  
  /**
    * The list of ARNs for resources to be added to the group. 
    */
  var ResourceArns: ResourceArnList
}
object GroupResourcesInput {
  
  @scala.inline
  def apply(Group: GroupString, ResourceArns: ResourceArnList): GroupResourcesInput = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupResourcesInput]
  }
  
  @scala.inline
  implicit class GroupResourcesInputMutableBuilder[Self <: GroupResourcesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
  }
}
