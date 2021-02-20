package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lowenergy extends StObject {
  
  var low_energy: js.UndefOr[Boolean] = js.native
  
  var peripheral: js.UndefOr[Boolean] = js.native
  
  var socket: js.UndefOr[Boolean] = js.native
  
  var uuids: js.UndefOr[js.Array[String]] = js.native
}
object Lowenergy {
  
  @scala.inline
  def apply(): Lowenergy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lowenergy]
  }
  
  @scala.inline
  implicit class LowenergyMutableBuilder[Self <: Lowenergy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLow_energy(value: Boolean): Self = StObject.set(x, "low_energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow_energyUndefined: Self = StObject.set(x, "low_energy", js.undefined)
    
    @scala.inline
    def setPeripheral(value: Boolean): Self = StObject.set(x, "peripheral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeripheralUndefined: Self = StObject.set(x, "peripheral", js.undefined)
    
    @scala.inline
    def setSocket(value: Boolean): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
