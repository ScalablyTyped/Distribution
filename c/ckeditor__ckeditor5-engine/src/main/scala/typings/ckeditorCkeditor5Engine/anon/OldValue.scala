package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue[N /* <: js.UndefOr[String | Double | Boolean] */, O /* <: js.UndefOr[String | Double | Boolean] */] extends StObject {
  
  var key: String
  
  var newValue: /* import warning: importer.ImportType#apply Failed type conversion: N extends undefined ? null : N */ js.Any
  
  var oldValue: /* import warning: importer.ImportType#apply Failed type conversion: O extends undefined ? null : O */ js.Any
  
  var range: ReturnType[js.Function0[End]]
}
object OldValue {
  
  inline def apply[N /* <: js.UndefOr[String | Double | Boolean] */, O /* <: js.UndefOr[String | Double | Boolean] */](
    key: String,
    newValue: /* import warning: importer.ImportType#apply Failed type conversion: N extends undefined ? null : N */ js.Any,
    oldValue: /* import warning: importer.ImportType#apply Failed type conversion: O extends undefined ? null : O */ js.Any,
    range: ReturnType[js.Function0[End]]
  ): OldValue[N, O] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValue[N, O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldValue[?, ?], N /* <: js.UndefOr[String | Double | Boolean] */, O /* <: js.UndefOr[String | Double | Boolean] */] (val x: Self & (OldValue[N, O])) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: N extends undefined ? null : N */ js.Any
    ): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: O extends undefined ? null : O */ js.Any
    ): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
