package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OTAUpdateSummary extends StObject {
  
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
}
object OTAUpdateSummary {
  
  @scala.inline
  def apply(): OTAUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateSummary]
  }
  
  @scala.inline
  implicit class OTAUpdateSummaryMutableBuilder[Self <: OTAUpdateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setOtaUpdateArn(value: OTAUpdateArn): Self = StObject.set(x, "otaUpdateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateArnUndefined: Self = StObject.set(x, "otaUpdateArn", js.undefined)
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateIdUndefined: Self = StObject.set(x, "otaUpdateId", js.undefined)
  }
}
