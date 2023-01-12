package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  var attributes: js.Array[String]
  
  var classes: js.Array[String]
  
  var name: `true`
  
  var styles: js.Array[String]
}
object Classes {
  
  inline def apply(attributes: js.Array[String], classes: js.Array[String], styles: js.Array[String]): Classes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], name = true, styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setName(value: `true`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
