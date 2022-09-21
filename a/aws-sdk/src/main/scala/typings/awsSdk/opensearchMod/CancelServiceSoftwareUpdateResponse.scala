package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServiceSoftwareUpdateResponse extends StObject {
  
  /**
    * The current status of the OpenSearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.opensearchMod.ServiceSoftwareOptions] = js.undefined
}
object CancelServiceSoftwareUpdateResponse {
  
  inline def apply(): CancelServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelServiceSoftwareUpdateResponse]
  }
  
  extension [Self <: CancelServiceSoftwareUpdateResponse](x: Self) {
    
    inline def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
  }
}
