package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.PhoneNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAccountUsageServices
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var service: PhoneNumber
}
object TelcoAccountUsageServices {
  
  inline def apply(service: PhoneNumber): TelcoAccountUsageServices = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoAccountUsageServices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAccountUsageServices] (val x: Self) extends AnyVal {
    
    inline def setService(value: PhoneNumber): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
