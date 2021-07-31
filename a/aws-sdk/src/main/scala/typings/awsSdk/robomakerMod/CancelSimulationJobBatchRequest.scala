package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSimulationJobBatchRequest extends StObject {
  
  /**
    * The id of the batch to cancel.
    */
  var batch: Arn
}
object CancelSimulationJobBatchRequest {
  
  @scala.inline
  def apply(batch: Arn): CancelSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSimulationJobBatchRequest]
  }
  
  @scala.inline
  implicit class CancelSimulationJobBatchRequestMutableBuilder[Self <: CancelSimulationJobBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: Arn): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
  }
}
