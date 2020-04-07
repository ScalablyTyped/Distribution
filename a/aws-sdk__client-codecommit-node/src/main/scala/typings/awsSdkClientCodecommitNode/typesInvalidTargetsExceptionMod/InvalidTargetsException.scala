package typings.awsSdkClientCodecommitNode.typesInvalidTargetsExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTargetsException
  extends ServiceException[InvalidTargetsExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidTargetsException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetsException
}

object InvalidTargetsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidTargetsExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetsException,
    stack: String = null
  ): InvalidTargetsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTargetsException]
  }
}

