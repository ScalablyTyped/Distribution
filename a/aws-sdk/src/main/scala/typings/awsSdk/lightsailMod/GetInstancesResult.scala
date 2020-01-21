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
    * A token used for advancing to the next page of results from your get instances request.
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

