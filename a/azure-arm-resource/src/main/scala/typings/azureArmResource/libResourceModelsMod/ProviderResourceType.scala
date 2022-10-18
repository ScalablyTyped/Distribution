package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderResourceType extends StObject {
  
  /**
    * The aliases that are supported by this resource type.
    */
  var aliases: js.UndefOr[js.Array[AliasType]] = js.undefined
  
  /**
    * The API version.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The collection of locations where this resource type can be created.
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The properties.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object ProviderResourceType {
  
  inline def apply(): ProviderResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderResourceType]
  }
  
  extension [Self <: ProviderResourceType](x: Self) {
    
    inline def setAliases(value: js.Array[AliasType]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: AliasType*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setApiVersions(value: js.Array[String]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    inline def setApiVersionsVarargs(value: String*): Self = StObject.set(x, "apiVersions", js.Array(value*))
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
