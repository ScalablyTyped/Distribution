package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SanitizationWarning extends js.Object {
  
  /**
    * The name of the XML attribute that has been sanitized.
    */
  var AttributeName: js.UndefOr[string] = js.native
  
  /**
    * The name of the XML element that has been sanitized.
    */
  var ElementName: js.UndefOr[string] = js.native
  
  /**
    * Required. The reason for which the XML elements or attributes were sanitized.
    */
  var Reason: js.UndefOr[SanitizationWarningReason] = js.native
}
object SanitizationWarning {
  
  @scala.inline
  def apply(): SanitizationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SanitizationWarning]
  }
  
  @scala.inline
  implicit class SanitizationWarningOps[Self <: SanitizationWarning] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: string): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    
    @scala.inline
    def setElementName(value: string): Self = this.set("ElementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementName: Self = this.set("ElementName", js.undefined)
    
    @scala.inline
    def setReason(value: SanitizationWarningReason): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
  }
}
