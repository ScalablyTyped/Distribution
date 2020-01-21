package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvalidationRequest extends js.Object {
  /**
    * The distribution's ID.
    */
  var DistributionId: String = js.native
  /**
    * The identifier for the invalidation request, for example, IDFDVBD632BHDS5.
    */
  var Id: String = js.native
}

object GetInvalidationRequest {
  @scala.inline
  def apply(DistributionId: String, Id: String): GetInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInvalidationRequest]
  }
}

