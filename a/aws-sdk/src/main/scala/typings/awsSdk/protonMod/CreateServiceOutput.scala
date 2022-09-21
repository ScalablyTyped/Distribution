package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceOutput extends StObject {
  
  /**
    * The service detail data that's returned by Proton.
    */
  var service: Service
}
object CreateServiceOutput {
  
  inline def apply(service: Service): CreateServiceOutput = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceOutput]
  }
  
  extension [Self <: CreateServiceOutput](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
