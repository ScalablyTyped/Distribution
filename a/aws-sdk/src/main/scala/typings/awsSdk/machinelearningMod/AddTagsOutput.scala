package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsOutput extends StObject {
  
  /**
    * The ID of the ML object that was tagged.
    */
  var ResourceId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The type of the ML object that was tagged.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
}
object AddTagsOutput {
  
  inline def apply(): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsOutput]
  }
  
  extension [Self <: AddTagsOutput](x: Self) {
    
    inline def setResourceId(value: EntityId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: TaggableResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
