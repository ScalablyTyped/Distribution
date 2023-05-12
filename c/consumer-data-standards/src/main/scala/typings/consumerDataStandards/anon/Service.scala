package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var service: PhoneNumber
}
object Service {
  
  inline def apply(service: PhoneNumber): Service = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    inline def setService(value: PhoneNumber): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
