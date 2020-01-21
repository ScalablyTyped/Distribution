package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateS3ResourcesRequest extends js.Object {
  /**
    * The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * The S3 resources whose classification types you want to update.
    */
  var s3ResourcesUpdate: S3ResourcesClassificationUpdate = js.native
}

object UpdateS3ResourcesRequest {
  @scala.inline
  def apply(s3ResourcesUpdate: S3ResourcesClassificationUpdate, memberAccountId: AWSAccountId = null): UpdateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(s3ResourcesUpdate = s3ResourcesUpdate.asInstanceOf[js.Any])
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateS3ResourcesRequest]
  }
}

