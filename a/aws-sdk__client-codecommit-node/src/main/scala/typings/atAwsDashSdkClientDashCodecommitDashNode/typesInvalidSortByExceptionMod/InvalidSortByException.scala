package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidSortByExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSortByException
  extends ServiceException[_InvalidSortByExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidSortByException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidSortByException
}

object InvalidSortByException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidSortByExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidSortByException,
    stack: String = null
  ): InvalidSortByException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSortByException]
  }
}

