package typings.awsSdkClientSqsNode.typesInvalidMessageContentsMod

import typings.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMessageContents
  extends ServiceException[InvalidMessageContentsDetails]
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidMessageContents: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents
}

object InvalidMessageContents {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidMessageContentsDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents,
    stack: String = null
  ): InvalidMessageContents = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMessageContents]
  }
}

