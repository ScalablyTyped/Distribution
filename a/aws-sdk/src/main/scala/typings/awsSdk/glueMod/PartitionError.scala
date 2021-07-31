package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionError extends StObject {
  
  /**
    * The details about the partition error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.glueMod.ErrorDetail] = js.undefined
  
  /**
    * The values that define the partition.
    */
  var PartitionValues: js.UndefOr[ValueStringList] = js.undefined
}
object PartitionError {
  
  @scala.inline
  def apply(): PartitionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionError]
  }
  
  @scala.inline
  implicit class PartitionErrorMutableBuilder[Self <: PartitionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    @scala.inline
    def setPartitionValues(value: ValueStringList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValuesUndefined: Self = StObject.set(x, "PartitionValues", js.undefined)
    
    @scala.inline
    def setPartitionValuesVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value :_*))
  }
}
