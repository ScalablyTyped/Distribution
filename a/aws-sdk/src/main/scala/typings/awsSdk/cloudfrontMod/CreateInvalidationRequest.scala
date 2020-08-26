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
  @scala.inline
  implicit class CreateInvalidationRequestOps[Self <: CreateInvalidationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistributionId(value: String): Self = this.set("DistributionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidationBatch(value: InvalidationBatch): Self = this.set("InvalidationBatch", value.asInstanceOf[js.Any])
  }
  
}

