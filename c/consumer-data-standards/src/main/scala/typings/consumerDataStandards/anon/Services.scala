package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Services
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Summary of balances
    */
  var services: js.Array[ServiceId]
}
object Services {
  
  inline def apply(services: js.Array[ServiceId]): Services = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Services] (val x: Self) extends AnyVal {
    
    inline def setServices(value: js.Array[ServiceId]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: ServiceId*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
