package typings.awsSdkClientCodecommitNode.typesReferenceNameRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceNameRequiredException
  extends ServiceException[ReferenceNameRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_ReferenceNameRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException
}

object ReferenceNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReferenceNameRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException,
    stack: String = null
  ): ReferenceNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceNameRequiredException]
  }
}

