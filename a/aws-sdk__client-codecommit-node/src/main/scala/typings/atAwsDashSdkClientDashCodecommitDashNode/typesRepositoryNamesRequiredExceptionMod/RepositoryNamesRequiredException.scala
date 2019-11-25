package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryNamesRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNamesRequiredException
  extends ServiceException[_RepositoryNamesRequiredExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_RepositoryNamesRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNamesRequiredException
}

object RepositoryNamesRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _RepositoryNamesRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNamesRequiredException,
    stack: String = null
  ): RepositoryNamesRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNamesRequiredException]
  }
}

