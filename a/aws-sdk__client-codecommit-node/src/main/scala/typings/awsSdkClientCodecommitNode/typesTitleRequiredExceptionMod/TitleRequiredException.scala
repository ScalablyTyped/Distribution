package typings.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleRequiredException
  extends ServiceException[TitleRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_TitleRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException = js.native
}

object TitleRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TitleRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException
  ): TitleRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleRequiredException]
  }
  @scala.inline
  implicit class TitleRequiredExceptionOps[Self <: TitleRequiredException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

