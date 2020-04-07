package typings.awsSdkClientCodecommitNode.typesInvalidActorArnExceptionMod

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidActorArnException
  extends ServiceException[InvalidActorArnExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion {
  @JSName("name")
  var name_InvalidActorArnException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException
}

object InvalidActorArnException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidActorArnExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException,
    stack: String = null
  ): InvalidActorArnException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidActorArnException]
  }
}

