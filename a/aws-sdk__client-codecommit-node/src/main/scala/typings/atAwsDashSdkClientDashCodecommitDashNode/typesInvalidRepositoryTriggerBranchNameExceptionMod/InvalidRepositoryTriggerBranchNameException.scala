package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidRepositoryTriggerBranchNameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerBranchNameException
  extends ServiceException[_InvalidRepositoryTriggerBranchNameExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerBranchNameException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryTriggerBranchNameException
}

object InvalidRepositoryTriggerBranchNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRepositoryTriggerBranchNameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryTriggerBranchNameException,
    stack: String = null
  ): InvalidRepositoryTriggerBranchNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerBranchNameException]
  }
}

