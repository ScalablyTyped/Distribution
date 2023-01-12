package typings.ckeditorCkeditor5Engine.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataString extends StObject {
  
  var attributes: js.UndefOr[
    (Record[String, String | Double | Boolean]) | (js.Array[js.Tuple2[String, String | Double | Boolean]])
  ] = js.undefined
  
  var data: String
}
object DataString {
  
  inline def apply(data: String): DataString = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataString] (val x: Self) extends AnyVal {
    
    inline def setAttributes(
      value: (Record[String, String | Double | Boolean]) | (js.Array[js.Tuple2[String, String | Double | Boolean]])
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: (js.Tuple2[String, String | Double | Boolean])*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
