package typings.awsSdkClientS3Node.typesNoSuchBucketMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchBucket extends ServiceException[NoSuchBucketDetails] {
  @JSName("name")
  var name_NoSuchBucket: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchBucket
}

object NoSuchBucket {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NoSuchBucketDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchBucket,
    stack: String = null
  ): NoSuchBucket = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchBucket]
  }
}

