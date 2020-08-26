package typings.awsSdkClientCodecommitNode.typesReferenceDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDoesNotExistException
  extends ServiceException[ReferenceDoesNotExistExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_ReferenceDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException = js.native
}

object ReferenceDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReferenceDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
  ): ReferenceDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDoesNotExistException]
  }
  @scala.inline
  implicit class ReferenceDoesNotExistExceptionOps[Self <: ReferenceDoesNotExistException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

