package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidRepositoryTriggerRegionExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerRegionException
  extends ServiceException[_InvalidRepositoryTriggerRegionExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerRegionException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryTriggerRegionException
}

object InvalidRepositoryTriggerRegionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRepositoryTriggerRegionExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRepositoryTriggerRegionException,
    stack: String = null
  ): InvalidRepositoryTriggerRegionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerRegionException]
  }
}

