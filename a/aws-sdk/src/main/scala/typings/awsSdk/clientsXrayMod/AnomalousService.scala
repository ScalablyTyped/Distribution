package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalousService extends StObject {
  
  var ServiceId: js.UndefOr[typings.awsSdk.clientsXrayMod.ServiceId] = js.undefined
}
object AnomalousService {
  
  inline def apply(): AnomalousService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalousService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnomalousService] (val x: Self) extends AnyVal {
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
  }
}
