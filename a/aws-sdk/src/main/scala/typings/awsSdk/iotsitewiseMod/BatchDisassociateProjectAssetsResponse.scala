package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateProjectAssetsResponse extends js.Object {
  
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchDisassociateProjectAssetsErrors] = js.native
}
object BatchDisassociateProjectAssetsResponse {
  
  @scala.inline
  def apply(): BatchDisassociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateProjectAssetsResponse]
  }
  
  @scala.inline
  implicit class BatchDisassociateProjectAssetsResponseOps[Self <: BatchDisassociateProjectAssetsResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: AssetErrorDetails*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchDisassociateProjectAssetsErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
