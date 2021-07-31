package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateColumnStatisticsForTableResponse extends StObject {
  
  /**
    * List of ColumnStatisticsErrors.
    */
  var Errors: js.UndefOr[ColumnStatisticsErrors] = js.undefined
}
object UpdateColumnStatisticsForTableResponse {
  
  @scala.inline
  def apply(): UpdateColumnStatisticsForTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateColumnStatisticsForTableResponse]
  }
  
  @scala.inline
  implicit class UpdateColumnStatisticsForTableResponseMutableBuilder[Self <: UpdateColumnStatisticsForTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: ColumnStatisticsErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ColumnStatisticsError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
