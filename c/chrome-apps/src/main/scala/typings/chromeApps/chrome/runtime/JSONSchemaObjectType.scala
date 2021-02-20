package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chromeAppsStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONSchemaObjectType extends StObject {
  
  var additionalProperties: js.UndefOr[JSONSchemaObjectType] = js.native
  
  var properties: js.UndefOr[StringDictionary[JSONSchemaBasicType | JSONSchemaRefType]] = js.native
  
  /**
    * An 'object' can have known properties listed as 'properties', and can
    * optionally have 'additionalProperties' indicating a schema to apply to
    * keys that aren't found in 'properties'.
    */
  var `type`: `object` = js.native
}
object JSONSchemaObjectType {
  
  @scala.inline
  def apply(`type`: `object`): JSONSchemaObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaObjectType]
  }
  
  @scala.inline
  implicit class JSONSchemaObjectTypeMutableBuilder[Self <: JSONSchemaObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: JSONSchemaObjectType): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchemaBasicType | JSONSchemaRefType]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
