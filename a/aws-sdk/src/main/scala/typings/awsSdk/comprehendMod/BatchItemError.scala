package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchItemError extends js.Object {
  
  /**
    * The numeric error code of the error.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * A text description of the error.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
}
object BatchItemError {
  
  @scala.inline
  def apply(): BatchItemError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchItemError]
  }
  
  @scala.inline
  implicit class BatchItemErrorOps[Self <: BatchItemError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setIndex(value: Integer): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("Index", js.undefined)
  }
}
