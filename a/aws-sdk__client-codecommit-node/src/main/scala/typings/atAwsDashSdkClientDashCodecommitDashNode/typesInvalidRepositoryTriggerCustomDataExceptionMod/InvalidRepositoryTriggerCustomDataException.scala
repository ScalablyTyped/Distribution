package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidRepositoryTriggerCustomDataExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerCustomDataException
  extends ServiceException[_InvalidRepositoryTriggerCustomDataExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerCustomDataException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryTriggerCustomDataException
}

object InvalidRepositoryTriggerCustomDataException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRepositoryTriggerCustomDataExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryTriggerCustomDataException,
    stack: String = null
  ): InvalidRepositoryTriggerCustomDataException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerCustomDataException]
  }
}

