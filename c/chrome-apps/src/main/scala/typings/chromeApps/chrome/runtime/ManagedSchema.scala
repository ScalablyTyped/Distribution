package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chromeAppsStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level object can't have additionalProperties.
  * The properties declared are the policies for this app.
  */
@js.native
trait ManagedSchema extends StObject {
  
  /** Each schema must have either a $ref value or exactly one type. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  /**
    * 'properties' maps an optional key of this object to its schema. At the
    * top-level object, these keys are the policy names supported.
    */
  var properties: js.UndefOr[
    StringDictionary[
      JSONSchemaBasicType | JSONSchemaArrayType | JSONSchemaObjectType | JSONSchemaRefType
    ]
  ] = js.native
  
  /** The top-level schema must have type object. */
  var `type`: `object` = js.native
}
object ManagedSchema {
  
  @scala.inline
  def apply(`type`: `object`): ManagedSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedSchema]
  }
  
  @scala.inline
  implicit class ManagedSchemaMutableBuilder[Self <: ManagedSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def setProperties(
      value: StringDictionary[
          JSONSchemaBasicType | JSONSchemaArrayType | JSONSchemaObjectType | JSONSchemaRefType
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
