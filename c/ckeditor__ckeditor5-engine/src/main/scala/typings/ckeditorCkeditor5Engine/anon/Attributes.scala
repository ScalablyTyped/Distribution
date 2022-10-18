package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.Array[String]
  
  var children: js.Array[String]
}
object Attributes {
  
  inline def apply(attributes: js.Array[String], children: js.Array[String]): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
