package typings.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod

import typings.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumRepositoryNamesExceededException
  extends ServiceException[MaximumRepositoryNamesExceededExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_MaximumRepositoryNamesExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException = js.native
}

object MaximumRepositoryNamesExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumRepositoryNamesExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException
  ): MaximumRepositoryNamesExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumRepositoryNamesExceededException]
  }
  @scala.inline
  implicit class MaximumRepositoryNamesExceededExceptionOps[Self <: MaximumRepositoryNamesExceededException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

