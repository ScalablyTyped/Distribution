package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSMBFileShareVisibilityInput extends js.Object {
  
  /**
    * The shares on this gateway appear when listing shares.
    */
  var FileSharesVisible: Boolean = js.native
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object UpdateSMBFileShareVisibilityInput {
  
  @scala.inline
  def apply(FileSharesVisible: Boolean, GatewayARN: GatewayARN): UpdateSMBFileShareVisibilityInput = {
    val __obj = js.Dynamic.literal(FileSharesVisible = FileSharesVisible.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBFileShareVisibilityInput]
  }
  
  @scala.inline
  implicit class UpdateSMBFileShareVisibilityInputOps[Self <: UpdateSMBFileShareVisibilityInput] (val x: Self) extends AnyVal {
    
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
    def setFileSharesVisible(value: Boolean): Self = this.set("FileSharesVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
  }
}
