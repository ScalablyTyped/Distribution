package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateS3ResourcesResult extends js.Object {
  /**
    * S3 resources that couldn't be associated with Amazon Macie. An error code and an error message are provided for each failed item. 
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.native
}

object AssociateS3ResourcesResult {
  @scala.inline
  def apply(failedS3Resources: FailedS3Resources = null): AssociateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    if (failedS3Resources != null) __obj.updateDynamic("failedS3Resources")(failedS3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateS3ResourcesResult]
  }
}

