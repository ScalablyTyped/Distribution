package typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod

import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSortByException
  extends ServiceException[InvalidSortByExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidSortByException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException = js.native
}

object InvalidSortByException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidSortByExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException
  ): InvalidSortByException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSortByException]
  }
  @scala.inline
  implicit class InvalidSortByExceptionOps[Self <: InvalidSortByException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

