package typings.awsSdkClientCodecommitNode.typesInvalidTargetExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTargetException
  extends ServiceException[InvalidTargetExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidTargetException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetException
}

object InvalidTargetException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidTargetExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetException,
    stack: String = null
  ): InvalidTargetException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTargetException]
  }
}

