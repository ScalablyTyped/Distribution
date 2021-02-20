package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreatePartitionResponse extends StObject {
  
  /**
    * The errors encountered when trying to create the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.native
}
object BatchCreatePartitionResponse {
  
  @scala.inline
  def apply(): BatchCreatePartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePartitionResponse]
  }
  
  @scala.inline
  implicit class BatchCreatePartitionResponseMutableBuilder[Self <: BatchCreatePartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: PartitionErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: PartitionError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
