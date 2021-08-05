package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContextItem extends StObject {
  
  def getAttribute(key: String): String
  
  var getAttributeKeys: Iterable[String]
  
  var name: String
}
object SchemaContextItem {
  
  inline def apply(getAttribute: String => String, getAttributeKeys: Iterable[String], name: String): SchemaContextItem = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributeKeys = getAttributeKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContextItem]
  }
  
  extension [Self <: SchemaContextItem](x: Self) {
    
    inline def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetAttributeKeys(value: Iterable[String]): Self = StObject.set(x, "getAttributeKeys", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
