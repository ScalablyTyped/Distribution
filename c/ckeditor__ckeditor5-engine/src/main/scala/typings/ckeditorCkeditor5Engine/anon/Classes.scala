package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[String | RegExp | Boolean]] = js.undefined
  
  var classes: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  
  var name: js.UndefOr[String | RegExp] = js.undefined
  
  var styles: js.UndefOr[StringDictionary[String | RegExp]] = js.undefined
}
object Classes {
  
  inline def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  
  extension [Self <: Classes](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String | RegExp | Boolean]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClasses(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: (String | RegExp)*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    inline def setName(value: String | RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStyles(value: StringDictionary[String | RegExp]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
