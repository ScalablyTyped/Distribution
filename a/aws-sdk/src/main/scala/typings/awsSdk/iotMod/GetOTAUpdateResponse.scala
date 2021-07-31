package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOTAUpdateResponse extends StObject {
  
  /**
    * The OTA update info.
    */
  var otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.undefined
}
object GetOTAUpdateResponse {
  
  @scala.inline
  def apply(): GetOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOTAUpdateResponse]
  }
  
  @scala.inline
  implicit class GetOTAUpdateResponseMutableBuilder[Self <: GetOTAUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtaUpdateInfo(value: OTAUpdateInfo): Self = StObject.set(x, "otaUpdateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateInfoUndefined: Self = StObject.set(x, "otaUpdateInfo", js.undefined)
  }
}
