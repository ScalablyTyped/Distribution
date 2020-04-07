package typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleRequiredException
  extends ServiceException[TitleRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_TitleRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException
}

object TitleRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TitleRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException,
    stack: String = null
  ): TitleRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleRequiredException]
  }
}

