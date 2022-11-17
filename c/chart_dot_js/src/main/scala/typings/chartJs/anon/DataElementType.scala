package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataElementType extends StObject {
  
  var dataElementType: js.UndefOr[String | Null | false] = js.undefined
  
  var datasetElementType: js.UndefOr[String | Null | false] = js.undefined
}
object DataElementType {
  
  inline def apply(): DataElementType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataElementType]
  }
  
  extension [Self <: DataElementType](x: Self) {
    
    inline def setDataElementType(value: String | false): Self = StObject.set(x, "dataElementType", value.asInstanceOf[js.Any])
    
    inline def setDataElementTypeNull: Self = StObject.set(x, "dataElementType", null)
    
    inline def setDataElementTypeUndefined: Self = StObject.set(x, "dataElementType", js.undefined)
    
    inline def setDatasetElementType(value: String | false): Self = StObject.set(x, "datasetElementType", value.asInstanceOf[js.Any])
    
    inline def setDatasetElementTypeNull: Self = StObject.set(x, "datasetElementType", null)
    
    inline def setDatasetElementTypeUndefined: Self = StObject.set(x, "datasetElementType", js.undefined)
  }
}
