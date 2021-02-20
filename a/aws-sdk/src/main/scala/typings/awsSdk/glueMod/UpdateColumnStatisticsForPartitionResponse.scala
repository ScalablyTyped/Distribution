package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateColumnStatisticsForPartitionResponse extends StObject {
  
  /**
    * Error occurred during updating column statistics data.
    */
  var Errors: js.UndefOr[ColumnStatisticsErrors] = js.native
}
object UpdateColumnStatisticsForPartitionResponse {
  
  @scala.inline
  def apply(): UpdateColumnStatisticsForPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateColumnStatisticsForPartitionResponse]
  }
  
  @scala.inline
  implicit class UpdateColumnStatisticsForPartitionResponseMutableBuilder[Self <: UpdateColumnStatisticsForPartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: ColumnStatisticsErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ColumnStatisticsError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
