package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chromeAppsStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONSchemaObjectType extends js.Object {
  
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
  implicit class JSONSchemaObjectTypeOps[Self <: JSONSchemaObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: `object`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalProperties(value: JSONSchemaObjectType): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchemaBasicType | JSONSchemaRefType]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
