package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaContextItem extends StObject {
  
  def getAttribute(key: String): String = js.native
  
  var getAttributeKeys: Iterable[String] = js.native
  
  var name: String = js.native
}
object SchemaContextItem {
  
  @scala.inline
  def apply(getAttribute: String => String, getAttributeKeys: Iterable[String], name: String): SchemaContextItem = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributeKeys = getAttributeKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContextItem]
  }
  
  @scala.inline
  implicit class SchemaContextItemMutableBuilder[Self <: SchemaContextItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeKeys(value: Iterable[String]): Self = StObject.set(x, "getAttributeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
