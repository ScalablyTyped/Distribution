package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsRequest extends js.Object {
  /**
    * Optional. Number of jobs, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[integerMin1Max20] = js.native
  /**
    * Optional. Use this string, provided with the response to a previous request, to request the next batch of jobs.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typings.awsSdk.mediaconvertMod.Order] = js.native
  /**
    * Optional. Provide a queue name to get back only jobs from that queue.
    */
  var Queue: js.UndefOr[string] = js.native
  /**
    * Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  var Status: js.UndefOr[JobStatus] = js.native
}

object ListJobsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[integerMin1Max20] = js.undefined,
    NextToken: string = null,
    Order: Order = null,
    Queue: string = null,
    Status: JobStatus = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
}

