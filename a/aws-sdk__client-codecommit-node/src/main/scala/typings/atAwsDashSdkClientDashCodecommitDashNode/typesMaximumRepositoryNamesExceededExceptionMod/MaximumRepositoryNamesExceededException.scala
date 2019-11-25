package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMaximumRepositoryNamesExceededExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumRepositoryNamesExceededException
  extends ServiceException[_MaximumRepositoryNamesExceededExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_MaximumRepositoryNamesExceededException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MaximumRepositoryNamesExceededException
}

object MaximumRepositoryNamesExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _MaximumRepositoryNamesExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MaximumRepositoryNamesExceededException,
    stack: String = null
  ): MaximumRepositoryNamesExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumRepositoryNamesExceededException]
  }
}

