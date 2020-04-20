package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOfferingRequest extends js.Object {
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: string = js.native
}

object DescribeOfferingRequest {
  @scala.inline
  def apply(OfferingId: string): DescribeOfferingRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOfferingRequest]
  }
}

