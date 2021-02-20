package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalousService extends StObject {
  
  var ServiceId: js.UndefOr[typings.awsSdk.xrayMod.ServiceId] = js.native
}
object AnomalousService {
  
  @scala.inline
  def apply(): AnomalousService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalousService]
  }
  
  @scala.inline
  implicit class AnomalousServiceMutableBuilder[Self <: AnomalousService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
  }
}
