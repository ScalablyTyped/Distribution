package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSummary extends StObject {
  
  /**
    * The description for the action.
    */
  var description: js.UndefOr[ActionDescription] = js.undefined
  
  /**
    * The ID of the action.
    */
  var id: js.UndefOr[ActionId] = js.undefined
  
  /**
    * The tags for the action.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The targets for the action.
    */
  var targets: js.UndefOr[ActionTargetMap] = js.undefined
}
object ActionSummary {
  
  inline def apply(): ActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSummary]
  }
  
  extension [Self <: ActionSummary](x: Self) {
    
    inline def setDescription(value: ActionDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ActionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargets(value: ActionTargetMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
