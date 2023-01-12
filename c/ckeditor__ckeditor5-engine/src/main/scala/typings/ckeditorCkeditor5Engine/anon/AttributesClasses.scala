package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesClasses extends StObject {
  
  var attributes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var classes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var name: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[String | js.Array[String]] = js.undefined
}
object AttributesClasses {
  
  inline def apply(): AttributesClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributesClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesClasses] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: String | js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setClasses(value: String | js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStyles(value: String | js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
