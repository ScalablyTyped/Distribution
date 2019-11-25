package typings.atAwsDashSdkClientDashS3DashBrowser.typesBucketAlreadyExistsMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesCreateBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAlreadyExists
  extends ServiceException[_BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.BucketAlreadyExists
}

object BucketAlreadyExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BucketAlreadyExistsDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.BucketAlreadyExists,
    stack: String = null
  ): BucketAlreadyExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyExists]
  }
}

