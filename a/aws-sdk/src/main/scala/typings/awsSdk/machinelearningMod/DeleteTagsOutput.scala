package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTagsOutput extends StObject {
  
  /**
    * The ID of the ML object from which tags were deleted.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  
  /**
    * The type of the ML object from which tags were deleted.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
}
object DeleteTagsOutput {
  
  @scala.inline
  def apply(): DeleteTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTagsOutput]
  }
  
  @scala.inline
  implicit class DeleteTagsOutputMutableBuilder[Self <: DeleteTagsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: EntityId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: TaggableResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
