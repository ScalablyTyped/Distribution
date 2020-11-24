package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteTableVersionResponse extends js.Object {
  
  /**
    * A list of errors encountered while trying to delete the specified table versions.
    */
  var Errors: js.UndefOr[TableVersionErrors] = js.native
}
object BatchDeleteTableVersionResponse {
  
  @scala.inline
  def apply(): BatchDeleteTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteTableVersionResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteTableVersionResponseOps[Self <: BatchDeleteTableVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: TableVersionError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: TableVersionErrors): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
