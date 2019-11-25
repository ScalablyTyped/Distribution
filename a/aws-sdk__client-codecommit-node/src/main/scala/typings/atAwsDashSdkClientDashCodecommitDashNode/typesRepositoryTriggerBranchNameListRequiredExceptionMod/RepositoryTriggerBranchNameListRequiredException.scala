package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryTriggerBranchNameListRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTriggerBranchNameListRequiredException
  extends ServiceException[_RepositoryTriggerBranchNameListRequiredExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_RepositoryTriggerBranchNameListRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryTriggerBranchNameListRequiredException
}

object RepositoryTriggerBranchNameListRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _RepositoryTriggerBranchNameListRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryTriggerBranchNameListRequiredException,
    stack: String = null
  ): RepositoryTriggerBranchNameListRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggerBranchNameListRequiredException]
  }
}

