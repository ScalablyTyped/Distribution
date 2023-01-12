package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceGroupPatchable extends StObject {
  
  /**
    * The ID of the resource that manages this resource group.
    */
  var managedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[ResourceGroupProperties] = js.undefined
  
  /**
    * The tags attached to the resource group.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}
object ResourceGroupPatchable {
  
  inline def apply(): ResourceGroupPatchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupPatchable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceGroupPatchable] (val x: Self) extends AnyVal {
    
    inline def setManagedBy(value: String): Self = StObject.set(x, "managedBy", value.asInstanceOf[js.Any])
    
    inline def setManagedByUndefined: Self = StObject.set(x, "managedBy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: ResourceGroupProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
