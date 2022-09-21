package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFilterRequest extends StObject {
  
  /**
    * Defines the action that is to be applied to the findings that match the filter.
    */
  var action: FilterAction
  
  /**
    * A description of the filter.
    */
  var description: js.UndefOr[FilterDescription] = js.undefined
  
  /**
    * Defines the criteria to be used in the filter for querying findings.
    */
  var filterCriteria: FilterCriteria
  
  /**
    * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
    */
  var name: FilterName
  
  /**
    * The reason for creating the filter.
    */
  var reason: js.UndefOr[FilterReason] = js.undefined
  
  /**
    * A list of tags for the filter.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateFilterRequest {
  
  inline def apply(action: FilterAction, filterCriteria: FilterCriteria, name: FilterName): CreateFilterRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], filterCriteria = filterCriteria.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterRequest]
  }
  
  extension [Self <: CreateFilterRequest](x: Self) {
    
    inline def setAction(value: FilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: FilterDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReason(value: FilterReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
