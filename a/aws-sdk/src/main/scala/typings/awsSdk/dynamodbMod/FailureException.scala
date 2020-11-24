package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureException extends js.Object {
  
  /**
    * Description of the failure.
    */
  var ExceptionDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ExceptionDescription] = js.native
  
  /**
    * Exception name.
    */
  var ExceptionName: js.UndefOr[typings.awsSdk.dynamodbMod.ExceptionName] = js.native
}
object FailureException {
  
  @scala.inline
  def apply(): FailureException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureException]
  }
  
  @scala.inline
  implicit class FailureExceptionOps[Self <: FailureException] (val x: Self) extends AnyVal {
    
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
    def setExceptionDescription(value: ExceptionDescription): Self = this.set("ExceptionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionDescription: Self = this.set("ExceptionDescription", js.undefined)
    
    @scala.inline
    def setExceptionName(value: ExceptionName): Self = this.set("ExceptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionName: Self = this.set("ExceptionName", js.undefined)
  }
}
