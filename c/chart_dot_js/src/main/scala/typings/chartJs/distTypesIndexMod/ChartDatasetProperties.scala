package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDatasetProperties[TType /* <: ChartType */, TData] extends StObject {
  
  var data: TData
  
  var `type`: js.UndefOr[TType] = js.undefined
}
object ChartDatasetProperties {
  
  inline def apply[TType /* <: ChartType */, TData](data: TData): ChartDatasetProperties[TType, TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDatasetProperties[TType, TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartDatasetProperties[?, ?], TType /* <: ChartType */, TData] (val x: Self & (ChartDatasetProperties[TType, TData])) extends AnyVal {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
