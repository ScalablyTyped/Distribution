package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectOptions
  extends StObject
     with Loggable
     with Timeoutable
     with Forceable {
  
  var interval: Double
}
object SelectOptions {
  
  inline def apply(force: Boolean, interval: Double, log: Boolean, timeout: Double): SelectOptions = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectOptions] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
