package typings.ckeditorCkeditor5Engine.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassesName extends StObject {
  
  var attributes: js.UndefOr[Record[String, String | js.RegExp | Boolean]] = js.undefined
  
  var classes: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  var name: js.UndefOr[String | js.RegExp] = js.undefined
  
  var styles: js.UndefOr[Record[String, String]] = js.undefined
}
object ClassesName {
  
  inline def apply(): ClassesName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassesName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassesName] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String | js.RegExp | Boolean]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClasses(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setName(value: String | js.RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStyles(value: Record[String, String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
