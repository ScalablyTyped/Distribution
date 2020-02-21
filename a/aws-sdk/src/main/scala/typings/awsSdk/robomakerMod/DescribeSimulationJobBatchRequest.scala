package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSimulationJobBatchRequest extends js.Object {
  /**
    * The id of the batch to describe.
    */
  var batch: Arn = js.native
}

object DescribeSimulationJobBatchRequest {
  @scala.inline
  def apply(batch: Arn): DescribeSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSimulationJobBatchRequest]
  }
}

