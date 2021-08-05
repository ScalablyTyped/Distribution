package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverConfig extends StObject {
  
  /**
    * Search window time to look for dash-7 packets
    */
  var RecoveryWindow: js.UndefOr[integer] = js.undefined
  
  var State: js.UndefOr[typings.awsSdk.mediaconnectMod.State] = js.undefined
}
object FailoverConfig {
  
  inline def apply(): FailoverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverConfig]
  }
  
  extension [Self <: FailoverConfig](x: Self) {
    
    inline def setRecoveryWindow(value: integer): Self = StObject.set(x, "RecoveryWindow", value.asInstanceOf[js.Any])
    
    inline def setRecoveryWindowUndefined: Self = StObject.set(x, "RecoveryWindow", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
