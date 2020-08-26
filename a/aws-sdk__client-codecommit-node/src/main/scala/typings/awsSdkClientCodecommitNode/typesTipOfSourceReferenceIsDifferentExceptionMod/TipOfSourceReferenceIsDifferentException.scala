package typings.awsSdkClientCodecommitNode.typesTipOfSourceReferenceIsDifferentExceptionMod

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TipOfSourceReferenceIsDifferentException
  extends ServiceException[TipOfSourceReferenceIsDifferentExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_TipOfSourceReferenceIsDifferentException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException = js.native
}

object TipOfSourceReferenceIsDifferentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TipOfSourceReferenceIsDifferentExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
  ): TipOfSourceReferenceIsDifferentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
  }
  @scala.inline
  implicit class TipOfSourceReferenceIsDifferentExceptionOps[Self <: TipOfSourceReferenceIsDifferentException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

