package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableSerialConsoleAccessResult extends StObject {
  
  /**
    * If true, access to the EC2 serial console of all instances is enabled for your account. If false, access to the EC2 serial console of all instances is disabled for your account.
    */
  var SerialConsoleAccessEnabled: js.UndefOr[Boolean] = js.undefined
}
object DisableSerialConsoleAccessResult {
  
  inline def apply(): DisableSerialConsoleAccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableSerialConsoleAccessResult]
  }
  
  extension [Self <: DisableSerialConsoleAccessResult](x: Self) {
    
    inline def setSerialConsoleAccessEnabled(value: Boolean): Self = StObject.set(x, "SerialConsoleAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setSerialConsoleAccessEnabledUndefined: Self = StObject.set(x, "SerialConsoleAccessEnabled", js.undefined)
  }
}
