package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorConfig extends StObject {
  
  /**
    * The name of the monitor resource.
    */
  var MonitorName: Name
}
object MonitorConfig {
  
  inline def apply(MonitorName: Name): MonitorConfig = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorConfig]
  }
  
  extension [Self <: MonitorConfig](x: Self) {
    
    inline def setMonitorName(value: Name): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
  }
}
