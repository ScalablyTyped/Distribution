package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateS3ResourcesResult extends js.Object {
  /**
    * The S3 resources whose classification types can't be updated. An error code and an error message are provided for each failed item. 
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.native
}

object UpdateS3ResourcesResult {
  @scala.inline
  def apply(failedS3Resources: FailedS3Resources = null): UpdateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    if (failedS3Resources != null) __obj.updateDynamic("failedS3Resources")(failedS3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateS3ResourcesResult]
  }
}

