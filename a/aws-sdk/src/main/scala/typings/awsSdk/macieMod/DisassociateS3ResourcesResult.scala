package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateS3ResourcesResult extends js.Object {
  /**
    * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie Classic. An error code and an error message are provided for each failed item. 
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.native
}

object DisassociateS3ResourcesResult {
  @scala.inline
  def apply(failedS3Resources: FailedS3Resources = null): DisassociateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    if (failedS3Resources != null) __obj.updateDynamic("failedS3Resources")(failedS3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateS3ResourcesResult]
  }
}

