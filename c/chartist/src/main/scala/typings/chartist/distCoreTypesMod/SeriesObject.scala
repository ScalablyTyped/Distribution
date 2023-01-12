package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesObject[T] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var data: js.Array[SeriesValue[T]]
  
  var meta: js.UndefOr[Meta] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object SeriesObject {
  
  inline def apply[T](data: js.Array[SeriesValue[T]]): SeriesObject[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesObject[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesObject[?], T] (val x: Self & SeriesObject[T]) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setData(value: js.Array[SeriesValue[T]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: SeriesValue[T]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
