package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentData extends StObject {
  
  var meta: js.UndefOr[Meta] = js.undefined
  
  var value: NormalizedSeriesValue
  
  var valueIndex: Double
}
object SegmentData {
  
  inline def apply(valueIndex: Double): SegmentData = {
    val __obj = js.Dynamic.literal(valueIndex = valueIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentData] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setValue(value: NormalizedSeriesValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueIndex(value: Double): Self = StObject.set(x, "valueIndex", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
