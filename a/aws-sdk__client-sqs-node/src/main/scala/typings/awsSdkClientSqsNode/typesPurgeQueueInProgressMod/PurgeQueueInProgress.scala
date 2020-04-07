package typings.awsSdkClientSqsNode.typesPurgeQueueInProgressMod

import typings.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurgeQueueInProgress
  extends ServiceException[PurgeQueueInProgressDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_PurgeQueueInProgress: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress
}

object PurgeQueueInProgress {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PurgeQueueInProgressDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress,
    stack: String = null
  ): PurgeQueueInProgress = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeQueueInProgress]
  }
}

