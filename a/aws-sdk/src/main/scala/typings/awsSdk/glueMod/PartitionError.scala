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
  
  inline def apply(): PartitionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionError]
  }
  
  extension [Self <: PartitionError](x: Self) {
    
    inline def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    inline def setPartitionValues(value: ValueStringList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    inline def setPartitionValuesUndefined: Self = StObject.set(x, "PartitionValues", js.undefined)
    
    inline def setPartitionValuesVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value*))
  }
}
