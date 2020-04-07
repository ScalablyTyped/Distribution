package typings.awsSdkClientS3Browser.typesBucketAlreadyExistsMod

import typings.awsSdkClientS3Browser.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAlreadyExists
  extends ServiceException[BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists
}

object BucketAlreadyExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BucketAlreadyExistsDetails,
    message: String,
    name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists,
    stack: String = null
  ): BucketAlreadyExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyExists]
  }
}

