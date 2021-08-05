package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lowenergy extends StObject {
  
  var low_energy: js.UndefOr[Boolean] = js.undefined
  
  var peripheral: js.UndefOr[Boolean] = js.undefined
  
  var socket: js.UndefOr[Boolean] = js.undefined
  
  var uuids: js.UndefOr[js.Array[String]] = js.undefined
}
object Lowenergy {
  
  inline def apply(): Lowenergy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lowenergy]
  }
  
  extension [Self <: Lowenergy](x: Self) {
    
    inline def setLow_energy(value: Boolean): Self = StObject.set(x, "low_energy", value.asInstanceOf[js.Any])
    
    inline def setLow_energyUndefined: Self = StObject.set(x, "low_energy", js.undefined)
    
    inline def setPeripheral(value: Boolean): Self = StObject.set(x, "peripheral", value.asInstanceOf[js.Any])
    
    inline def setPeripheralUndefined: Self = StObject.set(x, "peripheral", js.undefined)
    
    inline def setSocket(value: Boolean): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    inline def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
    
    inline def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
