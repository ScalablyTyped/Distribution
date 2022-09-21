package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var attribute: js.UndefOr[js.Array[String]] = js.undefined
  
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setAttribute(value: js.Array[String]): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAttributeVarargs(value: String*): Self = StObject.set(x, "attribute", js.Array(value*))
    
    inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStyles(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "styles", js.Array(value*))
  }
}
