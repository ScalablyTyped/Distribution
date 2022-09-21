package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectTypeItem extends StObject {
  
  /**
    * The timestamp of when the domain was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Description of the profile object type.
    */
  var Description: text
  
  /**
    * The timestamp of when the domain was most recently edited.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: typeName
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ListProfileObjectTypeItem {
  
  inline def apply(Description: text, ObjectTypeName: typeName): ListProfileObjectTypeItem = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfileObjectTypeItem]
  }
  
  extension [Self <: ListProfileObjectTypeItem](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: text): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
