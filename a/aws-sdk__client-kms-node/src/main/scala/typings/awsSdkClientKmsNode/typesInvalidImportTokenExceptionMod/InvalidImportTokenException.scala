package typings.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod

import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidImportTokenException
  extends ServiceException[InvalidImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_InvalidImportTokenException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException = js.native
}

object InvalidImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidImportTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException
  ): InvalidImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidImportTokenException]
  }
  @scala.inline
  implicit class InvalidImportTokenExceptionOps[Self <: InvalidImportTokenException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

