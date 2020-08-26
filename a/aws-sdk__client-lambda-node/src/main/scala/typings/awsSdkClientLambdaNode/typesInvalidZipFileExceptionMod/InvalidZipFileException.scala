package typings.awsSdkClientLambdaNode.typesInvalidZipFileExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidZipFileException
  extends ServiceException[InvalidZipFileExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidZipFileException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException = js.native
}

object InvalidZipFileException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidZipFileExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException
  ): InvalidZipFileException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidZipFileException]
  }
  @scala.inline
  implicit class InvalidZipFileExceptionOps[Self <: InvalidZipFileException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

