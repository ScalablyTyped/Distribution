package typings.awsSdkClientKmsBrowser.typesExpiredImportTokenExceptionMod

import typings.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredImportTokenException
  extends ServiceException[ExpiredImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_ExpiredImportTokenException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ExpiredImportTokenException = js.native
}

object ExpiredImportTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExpiredImportTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ExpiredImportTokenException
  ): ExpiredImportTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredImportTokenException]
  }
  @scala.inline
  implicit class ExpiredImportTokenExceptionOps[Self <: ExpiredImportTokenException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ExpiredImportTokenException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

