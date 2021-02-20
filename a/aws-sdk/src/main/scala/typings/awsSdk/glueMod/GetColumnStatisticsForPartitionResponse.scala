package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetColumnStatisticsForPartitionResponse extends StObject {
  
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var ColumnStatisticsList: js.UndefOr[typings.awsSdk.glueMod.ColumnStatisticsList] = js.native
  
  /**
    * Error occurred during retrieving column statistics data.
    */
  var Errors: js.UndefOr[ColumnErrors] = js.native
}
object GetColumnStatisticsForPartitionResponse {
  
  @scala.inline
  def apply(): GetColumnStatisticsForPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetColumnStatisticsForPartitionResponse]
  }
  
  @scala.inline
  implicit class GetColumnStatisticsForPartitionResponseMutableBuilder[Self <: GetColumnStatisticsForPartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnStatisticsList(value: ColumnStatisticsList): Self = StObject.set(x, "ColumnStatisticsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStatisticsListUndefined: Self = StObject.set(x, "ColumnStatisticsList", js.undefined)
    
    @scala.inline
    def setColumnStatisticsListVarargs(value: ColumnStatistics*): Self = StObject.set(x, "ColumnStatisticsList", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: ColumnErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ColumnError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
