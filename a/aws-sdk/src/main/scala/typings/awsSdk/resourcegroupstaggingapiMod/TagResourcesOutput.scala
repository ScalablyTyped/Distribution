package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourcesOutput extends js.Object {
  /**
    * A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the failed resource. The value is a FailureInfo object that contains an error code, a status code, and an error message. If there are no errors, the FailedResourcesMap is empty.
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

