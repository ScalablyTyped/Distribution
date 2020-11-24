package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportFindingsError extends js.Object {
  
  /**
    * The code of the error returned by the BatchImportFindings operation.
    */
  var ErrorCode: NonEmptyString = js.native
  
  /**
    * The message of the error returned by the BatchImportFindings operation.
    */
  var ErrorMessage: NonEmptyString = js.native
  
  /**
    * The identifier of the finding that could not be updated.
    */
  var Id: NonEmptyString = js.native
}
object ImportFindingsError {
  
  @scala.inline
  def apply(ErrorCode: NonEmptyString, ErrorMessage: NonEmptyString, Id: NonEmptyString): ImportFindingsError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportFindingsError]
  }
  
  @scala.inline
  implicit class ImportFindingsErrorOps[Self <: ImportFindingsError] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: NonEmptyString): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: NonEmptyString): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
}
