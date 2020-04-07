package typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod

import typings.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueDoesNotExist
  extends ServiceException[QueueDoesNotExistDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDoesNotExist: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist
}

object QueueDoesNotExist {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: QueueDoesNotExistDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist,
    stack: String = null
  ): QueueDoesNotExist = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueDoesNotExist]
  }
}

