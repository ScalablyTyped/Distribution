package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANMulticastSession extends StObject {
  
  var DlDr: js.UndefOr[typings.awsSdk.iotwirelessMod.DlDr] = js.undefined
  
  var DlFreq: js.UndefOr[typings.awsSdk.iotwirelessMod.DlFreq] = js.undefined
  
  var SessionStartTime: js.UndefOr[js.Date] = js.undefined
  
  var SessionTimeout: js.UndefOr[typings.awsSdk.iotwirelessMod.SessionTimeout] = js.undefined
}
object LoRaWANMulticastSession {
  
  inline def apply(): LoRaWANMulticastSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANMulticastSession]
  }
  
  extension [Self <: LoRaWANMulticastSession](x: Self) {
    
    inline def setDlDr(value: DlDr): Self = StObject.set(x, "DlDr", value.asInstanceOf[js.Any])
    
    inline def setDlDrUndefined: Self = StObject.set(x, "DlDr", js.undefined)
    
    inline def setDlFreq(value: DlFreq): Self = StObject.set(x, "DlFreq", value.asInstanceOf[js.Any])
    
    inline def setDlFreqUndefined: Self = StObject.set(x, "DlFreq", js.undefined)
    
    inline def setSessionStartTime(value: js.Date): Self = StObject.set(x, "SessionStartTime", value.asInstanceOf[js.Any])
    
    inline def setSessionStartTimeUndefined: Self = StObject.set(x, "SessionStartTime", js.undefined)
    
    inline def setSessionTimeout(value: SessionTimeout): Self = StObject.set(x, "SessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "SessionTimeout", js.undefined)
  }
}
