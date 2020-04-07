package typings.awsSdkClientCodecommitNode.typesInvalidPullRequestEventTypeExceptionMod

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPullRequestEventTypeException
  extends ServiceException[InvalidPullRequestEventTypeExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestEventTypeException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestEventTypeException
}

object InvalidPullRequestEventTypeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidPullRequestEventTypeExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestEventTypeException,
    stack: String = null
  ): InvalidPullRequestEventTypeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestEventTypeException]
  }
}

