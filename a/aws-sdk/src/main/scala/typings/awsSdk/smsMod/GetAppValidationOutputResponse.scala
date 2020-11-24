package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppValidationOutputResponse extends js.Object {
  
  /**
    * The validation output.
    */
  var validationOutputList: js.UndefOr[ValidationOutputList] = js.native
}
object GetAppValidationOutputResponse {
  
  @scala.inline
  def apply(): GetAppValidationOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppValidationOutputResponse]
  }
  
  @scala.inline
  implicit class GetAppValidationOutputResponseOps[Self <: GetAppValidationOutputResponse] (val x: Self) extends AnyVal {
    
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
    def setValidationOutputListVarargs(value: ValidationOutput*): Self = this.set("validationOutputList", js.Array(value :_*))
    
    @scala.inline
    def setValidationOutputList(value: ValidationOutputList): Self = this.set("validationOutputList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationOutputList: Self = this.set("validationOutputList", js.undefined)
  }
}
