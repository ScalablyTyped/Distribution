package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobExecutionsForThingRequest extends js.Object {
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An optional filter that lets you search for jobs that have the specified status.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
  /**
    * The thing name.
    */
  var thingName: ThingName = js.native
}

object ListJobExecutionsForThingRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    status: JobExecutionStatus = null
  ): ListJobExecutionsForThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobExecutionsForThingRequest]
  }
}

