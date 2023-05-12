package typings.braintreeWeb.modulesHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldAttributeOptions extends StObject {
  
  var attribute: HostedFieldAttributeName
  
  var field: HostedFieldsHostedFieldsFieldName
  
  var value: js.UndefOr[String | Boolean] = js.undefined
}
object HostedFieldAttributeOptions {
  
  inline def apply(attribute: HostedFieldAttributeName, field: HostedFieldsHostedFieldsFieldName): HostedFieldAttributeOptions = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldAttributeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldAttributeOptions] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: HostedFieldAttributeName): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setField(value: HostedFieldsHostedFieldsFieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
