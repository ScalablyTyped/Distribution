package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your instances.
    */
  var instances: js.UndefOr[InstanceList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetInstances request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetInstancesResult {
  @scala.inline
  def apply(instances: InstanceList = null, nextPageToken: String = null): GetInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesResult]
  }
}

