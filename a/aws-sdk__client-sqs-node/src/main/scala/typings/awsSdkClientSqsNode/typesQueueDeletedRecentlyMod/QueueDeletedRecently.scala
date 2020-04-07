package typings.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod

import typings.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueDeletedRecently
  extends ServiceException[QueueDeletedRecentlyDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDeletedRecently: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently
}

object QueueDeletedRecently {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: QueueDeletedRecentlyDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently,
    stack: String = null
  ): QueueDeletedRecently = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueDeletedRecently]
  }
}

