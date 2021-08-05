package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMinutes extends StObject {
  
  /**
    * When specified, represents only the sum of metered minutes used by the resource to run tests.
    */
  var metered: js.UndefOr[Double] = js.undefined
  
  /**
    * When specified, represents the total minutes used by the resource to run tests.
    */
  var total: js.UndefOr[Double] = js.undefined
  
  /**
    * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
    */
  var unmetered: js.UndefOr[Double] = js.undefined
}
object DeviceMinutes {
  
  inline def apply(): DeviceMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMinutes]
  }
  
  extension [Self <: DeviceMinutes](x: Self) {
    
    inline def setMetered(value: Double): Self = StObject.set(x, "metered", value.asInstanceOf[js.Any])
    
    inline def setMeteredUndefined: Self = StObject.set(x, "metered", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setUnmetered(value: Double): Self = StObject.set(x, "unmetered", value.asInstanceOf[js.Any])
    
    inline def setUnmeteredUndefined: Self = StObject.set(x, "unmetered", js.undefined)
  }
}
