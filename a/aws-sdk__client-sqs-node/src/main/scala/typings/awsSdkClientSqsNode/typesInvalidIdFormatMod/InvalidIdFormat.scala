package typings.awsSdkClientSqsNode.typesInvalidIdFormatMod

import typings.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidIdFormat
  extends ServiceException[InvalidIdFormatDetails]
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidIdFormat: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat
}

object InvalidIdFormat {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidIdFormatDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat,
    stack: String = null
  ): InvalidIdFormat = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdFormat]
  }
}

