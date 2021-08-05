package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceResponse extends StObject {
  
  /**
    * The full description of your service following the update call.
    */
  var service: js.UndefOr[Service] = js.undefined
}
object UpdateServiceResponse {
  
  inline def apply(): UpdateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceResponse]
  }
  
  extension [Self <: UpdateServiceResponse](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
