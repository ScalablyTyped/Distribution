package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSeries extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var id_org: js.UndefOr[String] = js.undefined
  
  var values: js.Array[DataPoint]
}
object DataSeries {
  
  inline def apply(values: js.Array[DataPoint]): DataSeries = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSeries] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setId_org(value: String): Self = StObject.set(x, "id_org", value.asInstanceOf[js.Any])
    
    inline def setId_orgUndefined: Self = StObject.set(x, "id_org", js.undefined)
    
    inline def setValues(value: js.Array[DataPoint]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: DataPoint*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
