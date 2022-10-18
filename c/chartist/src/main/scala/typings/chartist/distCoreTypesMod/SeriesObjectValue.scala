package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesObjectValue[T] extends StObject {
  
  var meta: js.UndefOr[Meta] = js.undefined
  
  var value: T
}
object SeriesObjectValue {
  
  inline def apply[T](value: T): SeriesObjectValue[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesObjectValue[T]]
  }
  
  extension [Self <: SeriesObjectValue[?], T](x: Self & SeriesObjectValue[T]) {
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
