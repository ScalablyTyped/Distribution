package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSimulationJobBatchRequest extends StObject {
  
  /**
    * The id of the batch to describe.
    */
  var batch: Arn
}
object DescribeSimulationJobBatchRequest {
  
  @scala.inline
  def apply(batch: Arn): DescribeSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationJobBatchRequest]
  }
  
  @scala.inline
  implicit class DescribeSimulationJobBatchRequestMutableBuilder[Self <: DescribeSimulationJobBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: Arn): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
  }
}
