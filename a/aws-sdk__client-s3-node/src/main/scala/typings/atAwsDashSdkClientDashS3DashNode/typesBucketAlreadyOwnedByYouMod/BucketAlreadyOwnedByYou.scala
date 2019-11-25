package typings.atAwsDashSdkClientDashS3DashNode.typesBucketAlreadyOwnedByYouMod

import typings.atAwsDashSdkClientDashS3DashNode.typesCreateBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAlreadyOwnedByYou
  extends ServiceException[_BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BucketAlreadyOwnedByYou
}

object BucketAlreadyOwnedByYou {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BucketAlreadyOwnedByYouDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BucketAlreadyOwnedByYou,
    stack: String = null
  ): BucketAlreadyOwnedByYou = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyOwnedByYou]
  }
}

