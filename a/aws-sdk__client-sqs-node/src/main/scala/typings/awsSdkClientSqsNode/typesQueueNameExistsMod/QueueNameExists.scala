package typings.awsSdkClientSqsNode.typesQueueNameExistsMod

import typings.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueNameExists
  extends ServiceException[QueueNameExistsDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueNameExists: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists
}

object QueueNameExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: QueueNameExistsDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists,
    stack: String = null
  ): QueueNameExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueNameExists]
  }
}

