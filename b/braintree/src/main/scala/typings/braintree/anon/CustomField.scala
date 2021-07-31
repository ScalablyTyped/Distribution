package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomField extends StObject {
  
  var customField: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
}
object CustomField {
  
  @scala.inline
  def apply(): CustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomField]
  }
  
  @scala.inline
  implicit class CustomFieldMutableBuilder[Self <: CustomField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomField(value: String): Self = StObject.set(x, "customField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldUndefined: Self = StObject.set(x, "customField", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
