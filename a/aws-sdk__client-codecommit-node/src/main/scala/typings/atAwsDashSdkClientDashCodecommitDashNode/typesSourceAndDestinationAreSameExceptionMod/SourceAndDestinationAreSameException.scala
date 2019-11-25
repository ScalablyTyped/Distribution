package typings.atAwsDashSdkClientDashCodecommitDashNode.typesSourceAndDestinationAreSameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndDestinationAreSameException
  extends ServiceException[_SourceAndDestinationAreSameExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_SourceAndDestinationAreSameException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SourceAndDestinationAreSameException
}

object SourceAndDestinationAreSameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _SourceAndDestinationAreSameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SourceAndDestinationAreSameException,
    stack: String = null
  ): SourceAndDestinationAreSameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAndDestinationAreSameException]
  }
}

