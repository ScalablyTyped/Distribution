package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatSeriesObjectValue[T] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Meta] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: T
}
object FlatSeriesObjectValue {
  
  inline def apply[T](value: T): FlatSeriesObjectValue[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatSeriesObjectValue[T]]
  }
  
  extension [Self <: FlatSeriesObjectValue[?], T](x: Self & FlatSeriesObjectValue[T]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
