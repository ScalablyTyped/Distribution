package typings.awsSdkClientCodecommitNode.typesTargetsRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetsRequiredException
  extends ServiceException[TargetsRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_TargetsRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetsRequiredException
}

object TargetsRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TargetsRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetsRequiredException,
    stack: String = null
  ): TargetsRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetsRequiredException]
  }
}

