package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONSchemaArrayType extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType = js.native
  
  var `type`: array = js.native
}
object JSONSchemaArrayType {
  
  @scala.inline
  def apply(items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType, `type`: array): JSONSchemaArrayType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaArrayType]
  }
  
  @scala.inline
  implicit class JSONSchemaArrayTypeMutableBuilder[Self <: JSONSchemaArrayType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(value: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
