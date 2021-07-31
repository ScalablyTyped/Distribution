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
  
  @scala.inline
  def apply(): DeviceMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMinutes]
  }
  
  @scala.inline
  implicit class DeviceMinutesMutableBuilder[Self <: DeviceMinutes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetered(value: Double): Self = StObject.set(x, "metered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeteredUndefined: Self = StObject.set(x, "metered", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setUnmetered(value: Double): Self = StObject.set(x, "unmetered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmeteredUndefined: Self = StObject.set(x, "unmetered", js.undefined)
  }
}
