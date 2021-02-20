package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSeries extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var id_org: js.UndefOr[String] = js.native
  
  var values: js.Array[DataPoint] = js.native
}
object DataSeries {
  
  @scala.inline
  def apply(values: js.Array[DataPoint]): DataSeries = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSeries]
  }
  
  @scala.inline
  implicit class DataSeriesMutableBuilder[Self <: DataSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setId_org(value: String): Self = StObject.set(x, "id_org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_orgUndefined: Self = StObject.set(x, "id_org", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[DataPoint]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: DataPoint*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
