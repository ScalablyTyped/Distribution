package typings.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SameFileContentException
  extends ServiceException[SameFileContentExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_SameFileContentException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException = js.native
}

object SameFileContentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: SameFileContentExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
  ): SameFileContentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SameFileContentException]
  }
  @scala.inline
  implicit class SameFileContentExceptionOps[Self <: SameFileContentException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

