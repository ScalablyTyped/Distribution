package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLocalConsolePasswordInput extends StObject {
  
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
  implicit class SetLocalConsolePasswordInputMutableBuilder[Self <: SetLocalConsolePasswordInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalConsolePassword(value: LocalConsolePassword): Self = StObject.set(x, "LocalConsolePassword", value.asInstanceOf[js.Any])
  }
}
