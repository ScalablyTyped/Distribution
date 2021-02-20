package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeletePartitionResponse extends StObject {
  
  /**
    * The errors encountered when trying to delete the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.native
}
object BatchDeletePartitionResponse {
  
  @scala.inline
  def apply(): BatchDeletePartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePartitionResponse]
  }
  
  @scala.inline
  implicit class BatchDeletePartitionResponseMutableBuilder[Self <: BatchDeletePartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: PartitionErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: PartitionError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
