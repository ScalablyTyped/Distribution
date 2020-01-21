package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourcesOutput extends js.Object {
  /**
    * Details of resources that could not be tagged. An error code, status code, and error message are returned for each failed item.
    */
  var FailedResourcesMap: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.FailedResourcesMap] = js.native
}

object TagResourcesOutput {
  @scala.inline
  def apply(FailedResourcesMap: FailedResourcesMap = null): TagResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (FailedResourcesMap != null) __obj.updateDynamic("FailedResourcesMap")(FailedResourcesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourcesOutput]
  }
}

