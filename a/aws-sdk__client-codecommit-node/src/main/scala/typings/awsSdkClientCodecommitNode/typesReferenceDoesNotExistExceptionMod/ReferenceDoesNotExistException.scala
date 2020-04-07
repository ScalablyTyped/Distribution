package typings.awsSdkClientCodecommitNode.typesReferenceDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDoesNotExistException
  extends ServiceException[ReferenceDoesNotExistExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_ReferenceDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
}

object ReferenceDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReferenceDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException,
    stack: String = null
  ): ReferenceDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDoesNotExistException]
  }
}

