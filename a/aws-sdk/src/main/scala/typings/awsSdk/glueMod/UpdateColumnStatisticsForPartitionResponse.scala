package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateColumnStatisticsForPartitionResponse extends StObject {
  
  /**
    * Error occurred during updating column statistics data.
    */
  var Errors: js.UndefOr[ColumnStatisticsErrors] = js.undefined
}
object UpdateColumnStatisticsForPartitionResponse {
  
  inline def apply(): UpdateColumnStatisticsForPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateColumnStatisticsForPartitionResponse]
  }
  
  extension [Self <: UpdateColumnStatisticsForPartitionResponse](x: Self) {
    
    inline def setErrors(value: ColumnStatisticsErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: ColumnStatisticsError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
