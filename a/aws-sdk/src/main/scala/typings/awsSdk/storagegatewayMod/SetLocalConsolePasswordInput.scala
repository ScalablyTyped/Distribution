package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLocalConsolePasswordInput extends js.Object {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * The password you want to set for your VM local console.
    */
  var LocalConsolePassword: typings.awsSdk.storagegatewayMod.LocalConsolePassword = js.native
}
object SetLocalConsolePasswordInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN, LocalConsolePassword: LocalConsolePassword): SetLocalConsolePasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], LocalConsolePassword = LocalConsolePassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLocalConsolePasswordInput]
  }
  
  @scala.inline
  implicit class SetLocalConsolePasswordInputOps[Self <: SetLocalConsolePasswordInput] (val x: Self) extends AnyVal {
    
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalConsolePassword(value: LocalConsolePassword): Self = this.set("LocalConsolePassword", value.asInstanceOf[js.Any])
  }
}
