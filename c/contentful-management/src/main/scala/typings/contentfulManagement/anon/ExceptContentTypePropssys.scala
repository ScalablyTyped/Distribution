package typings.contentfulManagement.anon

import typings.contentfulManagement.contentTypeFieldsMod.ContentFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined type-fest.type-fest.Except<contentful-management.contentful-management/dist/typings/entities/content-type.ContentTypeProps, 'sys'> */
trait ExceptContentTypePropssys extends StObject {
  
  var description: String
  
  var displayField: String
  
  var fields: js.Array[ContentFields]
  
  var name: String
}
object ExceptContentTypePropssys {
  
  @scala.inline
  def apply(description: String, displayField: String, fields: js.Array[ContentFields], name: String): ExceptContentTypePropssys = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayField = displayField.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptContentTypePropssys]
  }
  
  @scala.inline
  implicit class ExceptContentTypePropssysMutableBuilder[Self <: ExceptContentTypePropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[ContentFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: ContentFields*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
