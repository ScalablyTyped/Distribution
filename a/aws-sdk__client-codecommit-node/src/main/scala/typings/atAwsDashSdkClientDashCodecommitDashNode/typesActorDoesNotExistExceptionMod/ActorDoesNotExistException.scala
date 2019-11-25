package typings.atAwsDashSdkClientDashCodecommitDashNode.typesActorDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActorDoesNotExistException
  extends ServiceException[_ActorDoesNotExistExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion {
  @JSName("name")
  var name_ActorDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ActorDoesNotExistException
}

object ActorDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ActorDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ActorDoesNotExistException,
    stack: String = null
  ): ActorDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorDoesNotExistException]
  }
}

