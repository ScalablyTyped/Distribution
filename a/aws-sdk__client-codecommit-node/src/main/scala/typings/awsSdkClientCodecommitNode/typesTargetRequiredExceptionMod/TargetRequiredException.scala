package typings.awsSdkClientCodecommitNode.typesTargetRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetRequiredException
  extends ServiceException[TargetRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_TargetRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetRequiredException
}

object TargetRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TargetRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetRequiredException,
    stack: String = null
  ): TargetRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetRequiredException]
  }
}

