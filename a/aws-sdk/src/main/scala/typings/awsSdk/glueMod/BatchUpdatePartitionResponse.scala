package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePartitionResponse extends StObject {
  
  /**
    * The errors encountered when trying to update the requested partitions. A list of BatchUpdatePartitionFailureEntry objects.
    */
  var Errors: js.UndefOr[BatchUpdatePartitionFailureList] = js.undefined
}
object BatchUpdatePartitionResponse {
  
  @scala.inline
  def apply(): BatchUpdatePartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePartitionResponse]
  }
  
  @scala.inline
  implicit class BatchUpdatePartitionResponseMutableBuilder[Self <: BatchUpdatePartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchUpdatePartitionFailureList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchUpdatePartitionFailureEntry*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
