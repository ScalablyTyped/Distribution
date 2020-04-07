package typings.awsSdkClientCodecommitNode.typesInvalidReferenceNameExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidReferenceNameException
  extends ServiceException[InvalidReferenceNameExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidReferenceNameException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidReferenceNameException
}

object InvalidReferenceNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidReferenceNameExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidReferenceNameException,
    stack: String = null
  ): InvalidReferenceNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidReferenceNameException]
  }
}

