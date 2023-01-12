package typings.ckeditorCkeditor5Engine.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesData extends StObject {
  
  var attributes: Record[String, String | Double | Boolean]
  
  var data: String
}
object AttributesData {
  
  inline def apply(attributes: Record[String, String | Double | Boolean], data: String): AttributesData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesData] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String | Double | Boolean]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
