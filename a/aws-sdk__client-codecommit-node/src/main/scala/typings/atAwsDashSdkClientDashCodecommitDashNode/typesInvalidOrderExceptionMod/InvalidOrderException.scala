package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidOrderExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidOrderException
  extends ServiceException[_InvalidOrderExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidOrderException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidOrderException
}

object InvalidOrderException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidOrderExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidOrderException,
    stack: String = null
  ): InvalidOrderException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidOrderException]
  }
}

