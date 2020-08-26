package typings.awsSdkClientCodecommitNode.typesReferenceTypeNotSupportedExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceTypeNotSupportedException
  extends ServiceException[ReferenceTypeNotSupportedExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_ReferenceTypeNotSupportedException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException = js.native
}

object ReferenceTypeNotSupportedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReferenceTypeNotSupportedExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException
  ): ReferenceTypeNotSupportedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceTypeNotSupportedException]
  }
  @scala.inline
  implicit class ReferenceTypeNotSupportedExceptionOps[Self <: ReferenceTypeNotSupportedException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

