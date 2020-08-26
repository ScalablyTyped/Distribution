package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingRequest extends js.Object {
  /**
    * Number of resources
    */
  var Count: integerMin1 = js.native
  /**
    * Name for the new reservation
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Offering to purchase, e.g. '87654321'
    */
  var OfferingId: string = js.native
  /**
    * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of the current month and one year from now. If no value is given, the default is now.
    */
  var Start: js.UndefOr[string] = js.native
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}

object PurchaseOfferingRequest {
  @scala.inline
  def apply(Count: integerMin1, OfferingId: string): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  @scala.inline
  implicit class PurchaseOfferingRequestOps[Self <: PurchaseOfferingRequest] (val x: Self) extends AnyVal {
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
    def setCount(value: integerMin1): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfferingId(value: string): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRequestId(value: string): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStart(value: string): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

