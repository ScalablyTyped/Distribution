package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCollectionOption extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var shape: js.UndefOr[ShapeType] = js.undefined
  
  var size: js.UndefOr[SizeType] = js.undefined
}
object PointCollectionOption {
  
  inline def apply(): PointCollectionOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCollectionOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCollectionOption] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setShape(value: ShapeType): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
