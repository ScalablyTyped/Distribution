package typings.awsSdkClientCodecommitNode.typesReferenceNameRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceNameRequiredException
  extends ServiceException[ReferenceNameRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_ReferenceNameRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException = js.native
}

object ReferenceNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReferenceNameRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException
  ): ReferenceNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceNameRequiredException]
  }
  @scala.inline
  implicit class ReferenceNameRequiredExceptionOps[Self <: ReferenceNameRequiredException] (val x: Self) extends AnyVal {
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
    def setName(
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

