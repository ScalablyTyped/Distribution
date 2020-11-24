package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchReadOperationResponse extends js.Object {
  
  /**
    * Identifies which operation in a batch has failed.
    */
  var ExceptionResponse: js.UndefOr[BatchReadException] = js.native
  
  /**
    * Identifies which operation in a batch has succeeded.
    */
  var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.native
}
object BatchReadOperationResponse {
  
  @scala.inline
  def apply(): BatchReadOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadOperationResponse]
  }
  
  @scala.inline
  implicit class BatchReadOperationResponseOps[Self <: BatchReadOperationResponse] (val x: Self) extends AnyVal {
    
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
    def setExceptionResponse(value: BatchReadException): Self = this.set("ExceptionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionResponse: Self = this.set("ExceptionResponse", js.undefined)
    
    @scala.inline
    def setSuccessfulResponse(value: BatchReadSuccessfulResponse): Self = this.set("SuccessfulResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulResponse: Self = this.set("SuccessfulResponse", js.undefined)
  }
}
