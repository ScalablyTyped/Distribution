package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OTAUpdateSummary extends StObject {
  
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
}
object OTAUpdateSummary {
  
  inline def apply(): OTAUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateSummary]
  }
  
  extension [Self <: OTAUpdateSummary](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setOtaUpdateArn(value: OTAUpdateArn): Self = StObject.set(x, "otaUpdateArn", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateArnUndefined: Self = StObject.set(x, "otaUpdateArn", js.undefined)
    
    inline def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateIdUndefined: Self = StObject.set(x, "otaUpdateId", js.undefined)
  }
}
