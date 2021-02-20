package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsOutput extends StObject {
  
  /**
    * The ID of the ML object that was tagged.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  
  /**
    * The type of the ML object that was tagged.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
}
object AddTagsOutput {
  
  @scala.inline
  def apply(): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsOutput]
  }
  
  @scala.inline
  implicit class AddTagsOutputMutableBuilder[Self <: AddTagsOutput] (val x: Self) extends AnyVal {
    
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
