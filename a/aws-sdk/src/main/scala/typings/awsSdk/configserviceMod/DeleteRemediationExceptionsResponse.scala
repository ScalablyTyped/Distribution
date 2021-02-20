package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRemediationExceptionsResponse extends StObject {
  
  /**
    * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list of failed items and failure messages.
    */
  var FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches] = js.native
}
object DeleteRemediationExceptionsResponse {
  
  @scala.inline
  def apply(): DeleteRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRemediationExceptionsResponse]
  }
  
  @scala.inline
  implicit class DeleteRemediationExceptionsResponseMutableBuilder[Self <: DeleteRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedBatches(value: FailedDeleteRemediationExceptionsBatches): Self = StObject.set(x, "FailedBatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedBatchesUndefined: Self = StObject.set(x, "FailedBatches", js.undefined)
    
    @scala.inline
    def setFailedBatchesVarargs(value: FailedDeleteRemediationExceptionsBatch*): Self = StObject.set(x, "FailedBatches", js.Array(value :_*))
  }
}
