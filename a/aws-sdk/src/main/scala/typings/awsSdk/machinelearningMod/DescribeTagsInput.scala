package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTagsInput extends StObject {
  
  /**
    * The ID of the ML object. For example, exampleModelId. 
    */
  var ResourceId: EntityId
  
  /**
    * The type of the ML object.
    */
  var ResourceType: TaggableResourceType
}
object DescribeTagsInput {
  
  @scala.inline
  def apply(ResourceId: EntityId, ResourceType: TaggableResourceType): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
  
  @scala.inline
  implicit class DescribeTagsInputMutableBuilder[Self <: DescribeTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: EntityId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: TaggableResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
