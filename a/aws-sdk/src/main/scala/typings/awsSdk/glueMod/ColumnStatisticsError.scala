package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnStatisticsError extends StObject {
  
  /**
    * The ColumnStatistics of the column.
    */
  var ColumnStatistics: js.UndefOr[typings.awsSdk.glueMod.ColumnStatistics] = js.native
  
  /**
    * An error message with the reason for the failure of an operation.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
}
object ColumnStatisticsError {
  
  @scala.inline
  def apply(): ColumnStatisticsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnStatisticsError]
  }
  
  @scala.inline
  implicit class ColumnStatisticsErrorMutableBuilder[Self <: ColumnStatisticsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnStatistics(value: ColumnStatistics): Self = StObject.set(x, "ColumnStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStatisticsUndefined: Self = StObject.set(x, "ColumnStatistics", js.undefined)
    
    @scala.inline
    def setError(value: ErrorDetail): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
