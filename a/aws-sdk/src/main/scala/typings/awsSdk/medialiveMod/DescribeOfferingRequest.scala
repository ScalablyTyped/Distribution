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
  @scala.inline
  implicit class DescribeOfferingRequestOps[Self <: DescribeOfferingRequest] (val x: Self) extends AnyVal {
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
    def setOfferingId(value: string): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
  }
  
}

