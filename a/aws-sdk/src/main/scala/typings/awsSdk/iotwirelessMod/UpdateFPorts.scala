package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFPorts extends StObject {
  
  /**
    * Positioning FPorts for the ClockSync, Stream, and GNSS functions.
    */
  var Positioning: js.UndefOr[typings.awsSdk.iotwirelessMod.Positioning] = js.undefined
}
object UpdateFPorts {
  
  inline def apply(): UpdateFPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFPorts]
  }
  
  extension [Self <: UpdateFPorts](x: Self) {
    
    inline def setPositioning(value: Positioning): Self = StObject.set(x, "Positioning", value.asInstanceOf[js.Any])
    
    inline def setPositioningUndefined: Self = StObject.set(x, "Positioning", js.undefined)
  }
}
