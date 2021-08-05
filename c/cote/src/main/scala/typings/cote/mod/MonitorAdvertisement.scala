package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorAdvertisement
  extends StObject
     with Advertisement {
  
  /**
    * Port for Monitor to listen on. By default will start searching from 8000.
    */
  var port: js.UndefOr[Double | String] = js.undefined
}
object MonitorAdvertisement {
  
  inline def apply(name: String): MonitorAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorAdvertisement]
  }
  
  extension [Self <: MonitorAdvertisement](x: Self) {
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
