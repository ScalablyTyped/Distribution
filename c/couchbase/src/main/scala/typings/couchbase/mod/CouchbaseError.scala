package typings.couchbase.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The virtual class thrown for all Couchnode errors.
  */
@js.native
trait CouchbaseError extends Error {
  
  /**
    * The error code for this error.
    */
  var code: js.UndefOr[errors] = js.native
  
  /**
    * Possible inner error for this error.
    */
  var innerError: js.UndefOr[CouchbaseError] = js.native
  
  /**
    * Possible response body included with the error.
    */
  var responseBody: js.UndefOr[js.Any] = js.native
}
object CouchbaseError {
  
  @scala.inline
  def apply(message: String, name: String): CouchbaseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CouchbaseError]
  }
  
  @scala.inline
  implicit class CouchbaseErrorOps[Self <: CouchbaseError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: errors): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setInnerError(value: CouchbaseError): Self = this.set("innerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerError: Self = this.set("innerError", js.undefined)
    
    @scala.inline
    def setResponseBody(value: js.Any): Self = this.set("responseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBody: Self = this.set("responseBody", js.undefined)
  }
}
