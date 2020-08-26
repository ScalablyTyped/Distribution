package typings.awsSdkClientCodecommitNode.typesInvalidMergeOptionExceptionMod

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidMergeOptionException
  extends ServiceException[InvalidMergeOptionExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidMergeOptionException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMergeOptionException = js.native
}

object InvalidMergeOptionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidMergeOptionExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMergeOptionException
  ): InvalidMergeOptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMergeOptionException]
  }
  @scala.inline
  implicit class InvalidMergeOptionExceptionOps[Self <: InvalidMergeOptionException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMergeOptionException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

