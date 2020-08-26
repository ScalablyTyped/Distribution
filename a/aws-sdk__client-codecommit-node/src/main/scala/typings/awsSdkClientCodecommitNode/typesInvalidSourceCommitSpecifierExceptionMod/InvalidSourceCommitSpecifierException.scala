package typings.awsSdkClientCodecommitNode.typesInvalidSourceCommitSpecifierExceptionMod

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSourceCommitSpecifierException
  extends ServiceException[InvalidSourceCommitSpecifierExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidSourceCommitSpecifierException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException = js.native
}

object InvalidSourceCommitSpecifierException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidSourceCommitSpecifierExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException
  ): InvalidSourceCommitSpecifierException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSourceCommitSpecifierException]
  }
  @scala.inline
  implicit class InvalidSourceCommitSpecifierExceptionOps[Self <: InvalidSourceCommitSpecifierException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

