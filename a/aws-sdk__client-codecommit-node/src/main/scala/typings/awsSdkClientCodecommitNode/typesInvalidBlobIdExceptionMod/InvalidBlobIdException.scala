package typings.awsSdkClientCodecommitNode.typesInvalidBlobIdExceptionMod

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidBlobIdException
  extends ServiceException[InvalidBlobIdExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_InvalidBlobIdException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBlobIdException = js.native
}

object InvalidBlobIdException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidBlobIdExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBlobIdException
  ): InvalidBlobIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidBlobIdException]
  }
  @scala.inline
  implicit class InvalidBlobIdExceptionOps[Self <: InvalidBlobIdException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBlobIdException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

