package typings.ckeditorCkeditor5Engine.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesClassesName extends StObject {
  
  var attributes: js.UndefOr[
    (js.Array[`15` | js.RegExp | String]) | Boolean | String | js.RegExp | (Record[String, String | js.RegExp | Boolean | Double])
  ] = js.undefined
  
  var classes: js.UndefOr[
    (js.Array[js.RegExp | String | ValueBoolean]) | Boolean | String | js.RegExp | (Record[String, Boolean])
  ] = js.undefined
  
  var name: js.UndefOr[String | js.RegExp] = js.undefined
  
  var styles: js.UndefOr[js.RegExp | String | Boolean | (Record[String, String | js.RegExp | Boolean])] = js.undefined
}
object AttributesClassesName {
  
  inline def apply(): AttributesClassesName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributesClassesName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesClassesName] (val x: Self) extends AnyVal {
    
    inline def setAttributes(
      value: (js.Array[`15` | js.RegExp | String]) | Boolean | String | js.RegExp | (Record[String, String | js.RegExp | Boolean | Double])
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: (`15` | js.RegExp | String)*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setClasses(
      value: (js.Array[js.RegExp | String | ValueBoolean]) | Boolean | String | js.RegExp | (Record[String, Boolean])
    ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: (js.RegExp | String | ValueBoolean)*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setName(value: String | js.RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStyles(value: js.RegExp | String | Boolean | (Record[String, String | js.RegExp | Boolean])): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
