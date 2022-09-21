package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue[N /* <: js.UndefOr[String | Double | Boolean] */, O /* <: js.UndefOr[String | Double | Boolean] */] extends StObject {
  
  var key: String
  
  var newValue: N | Null
  
  var oldValue: O | Null
  
  var range: ReturnType[js.Function0[End]]
}
object OldValue {
  
  inline def apply[N /* <: js.UndefOr[String | Double | Boolean] */, O /* <: js.UndefOr[String | Double | Boolean] */](key: String, range: ReturnType[js.Function0[End]]): OldValue[N, O] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], newValue = null, oldValue = null)
    __obj.asInstanceOf[OldValue[N, O]]
  }
  
  extension [Self <: OldValue[?, ?], N /* <: js.UndefOr[String | Double | Boolean] */, O /* <: js.UndefOr[String | Double | Boolean] */](x: Self & (OldValue[N, O])) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: N): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setOldValue(value: O): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
