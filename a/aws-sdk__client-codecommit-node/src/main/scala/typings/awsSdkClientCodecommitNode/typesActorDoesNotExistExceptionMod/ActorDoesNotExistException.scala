package typings.awsSdkClientCodecommitNode.typesActorDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActorDoesNotExistException
  extends ServiceException[ActorDoesNotExistExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion {
  @JSName("name")
  var name_ActorDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ActorDoesNotExistException
}

object ActorDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ActorDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ActorDoesNotExistException,
    stack: String = null
  ): ActorDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorDoesNotExistException]
  }
}

