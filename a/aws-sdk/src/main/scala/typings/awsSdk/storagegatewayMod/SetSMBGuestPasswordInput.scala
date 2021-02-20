package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetSMBGuestPasswordInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
    */
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * The password that you want to set for your SMB server.
    */
  var Password: SMBGuestPassword = js.native
}
object SetSMBGuestPasswordInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN, Password: SMBGuestPassword): SetSMBGuestPasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSMBGuestPasswordInput]
  }
  
  @scala.inline
  implicit class SetSMBGuestPasswordInputMutableBuilder[Self <: SetSMBGuestPasswordInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: SMBGuestPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
