package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInvalidationRequest extends js.Object {
  /**
    * The distribution's id.
    */
  var DistributionId: String = js.native
  /**
    * The batch information for the invalidation.
    */
  var InvalidationBatch: typings.awsSdk.cloudfrontMod.InvalidationBatch = js.native
}

object CreateInvalidationRequest {
  @scala.inline
  def apply(DistributionId: String, InvalidationBatch: InvalidationBatch): CreateInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], InvalidationBatch = InvalidationBatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateInvalidationRequest]
  }
}

