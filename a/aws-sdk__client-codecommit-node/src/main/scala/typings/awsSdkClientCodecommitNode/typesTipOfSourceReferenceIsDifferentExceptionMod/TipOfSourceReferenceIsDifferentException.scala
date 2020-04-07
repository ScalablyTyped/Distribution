package typings.awsSdkClientCodecommitNode.typesTipOfSourceReferenceIsDifferentExceptionMod

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipOfSourceReferenceIsDifferentException
  extends ServiceException[TipOfSourceReferenceIsDifferentExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_TipOfSourceReferenceIsDifferentException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
}

object TipOfSourceReferenceIsDifferentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TipOfSourceReferenceIsDifferentExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException,
    stack: String = null
  ): TipOfSourceReferenceIsDifferentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
  }
}

