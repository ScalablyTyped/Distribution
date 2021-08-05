package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLocalConsolePasswordInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
  
  /**
    * The password you want to set for your VM local console.
    */
  var LocalConsolePassword: typings.awsSdk.storagegatewayMod.LocalConsolePassword
}
object SetLocalConsolePasswordInput {
  
  inline def apply(GatewayARN: GatewayARN, LocalConsolePassword: LocalConsolePassword): SetLocalConsolePasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], LocalConsolePassword = LocalConsolePassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLocalConsolePasswordInput]
  }
  
  extension [Self <: SetLocalConsolePasswordInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setLocalConsolePassword(value: LocalConsolePassword): Self = StObject.set(x, "LocalConsolePassword", value.asInstanceOf[js.Any])
  }
}
