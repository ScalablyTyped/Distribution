package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueNameExistsMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueNameExists
  extends ServiceException[_QueueNameExistsDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueNameExists: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueNameExists
}

object QueueNameExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _QueueNameExistsDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueNameExists,
    stack: String = null
  ): QueueNameExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueNameExists]
  }
}

