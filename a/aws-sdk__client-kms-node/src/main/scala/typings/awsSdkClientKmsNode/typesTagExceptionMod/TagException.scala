package typings.awsSdkClientKmsNode.typesTagExceptionMod

import typings.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientKmsNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagException
  extends ServiceException[TagExceptionDetails]
     with CreateKeyExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion {
  @JSName("name")
  var name_TagException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.TagException
}

object TagException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TagExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.TagException,
    stack: String = null
  ): TagException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagException]
  }
}

