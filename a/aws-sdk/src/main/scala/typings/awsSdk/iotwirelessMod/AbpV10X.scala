package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbpV10X extends StObject {
  
  /**
    * The DevAddr value.
    */
  var DevAddr: js.UndefOr[typings.awsSdk.iotwirelessMod.DevAddr] = js.undefined
  
  /**
    * The FCnt init value.
    */
  var FCntStart: js.UndefOr[typings.awsSdk.iotwirelessMod.FCntStart] = js.undefined
  
  /**
    * Session keys for ABP v1.0.x
    */
  var SessionKeys: js.UndefOr[SessionKeysAbpV10X] = js.undefined
}
object AbpV10X {
  
  inline def apply(): AbpV10X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbpV10X]
  }
  
  extension [Self <: AbpV10X](x: Self) {
    
    inline def setDevAddr(value: DevAddr): Self = StObject.set(x, "DevAddr", value.asInstanceOf[js.Any])
    
    inline def setDevAddrUndefined: Self = StObject.set(x, "DevAddr", js.undefined)
    
    inline def setFCntStart(value: FCntStart): Self = StObject.set(x, "FCntStart", value.asInstanceOf[js.Any])
    
    inline def setFCntStartUndefined: Self = StObject.set(x, "FCntStart", js.undefined)
    
    inline def setSessionKeys(value: SessionKeysAbpV10X): Self = StObject.set(x, "SessionKeys", value.asInstanceOf[js.Any])
    
    inline def setSessionKeysUndefined: Self = StObject.set(x, "SessionKeys", js.undefined)
  }
}
