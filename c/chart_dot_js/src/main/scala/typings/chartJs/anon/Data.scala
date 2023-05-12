package typings.chartJs.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.UndefOr[Record[String, Double]] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var garbageCollect: js.UndefOr[js.Array[String]] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: Record[String, Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setGarbageCollect(value: js.Array[String]): Self = StObject.set(x, "garbageCollect", value.asInstanceOf[js.Any])
    
    inline def setGarbageCollectUndefined: Self = StObject.set(x, "garbageCollect", js.undefined)
    
    inline def setGarbageCollectVarargs(value: String*): Self = StObject.set(x, "garbageCollect", js.Array(value*))
  }
}
