package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.elementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeOldValue extends StObject {
  
  var attributeKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any
  
  var attributeNewValue: Any
  
  var attributeOldValue: Any
  
  var item: default
  
  var range: typings.ckeditorCkeditor5Engine.rangeMod.default
}
object AttributeOldValue {
  
  inline def apply(
    attributeKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any,
    attributeNewValue: Any,
    attributeOldValue: Any,
    item: default,
    range: typings.ckeditorCkeditor5Engine.rangeMod.default
  ): AttributeOldValue = {
    val __obj = js.Dynamic.literal(attributeKey = attributeKey.asInstanceOf[js.Any], attributeNewValue = attributeNewValue.asInstanceOf[js.Any], attributeOldValue = attributeOldValue.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeOldValue]
  }
  
  extension [Self <: AttributeOldValue](x: Self) {
    
    inline def setAttributeKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any
    ): Self = StObject.set(x, "attributeKey", value.asInstanceOf[js.Any])
    
    inline def setAttributeNewValue(value: Any): Self = StObject.set(x, "attributeNewValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeOldValue(value: Any): Self = StObject.set(x, "attributeOldValue", value.asInstanceOf[js.Any])
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
