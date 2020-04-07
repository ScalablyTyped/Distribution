package typings.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod

import typings.awsSdkClientS3Node.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAlreadyOwnedByYou
  extends ServiceException[BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou
}

object BucketAlreadyOwnedByYou {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BucketAlreadyOwnedByYouDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou,
    stack: String = null
  ): BucketAlreadyOwnedByYou = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyOwnedByYou]
  }
}

