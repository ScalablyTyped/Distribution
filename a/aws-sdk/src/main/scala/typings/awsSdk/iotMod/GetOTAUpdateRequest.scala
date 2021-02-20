package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOTAUpdateRequest extends StObject {
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: OTAUpdateId = js.native
}
object GetOTAUpdateRequest {
  
  @scala.inline
  def apply(otaUpdateId: OTAUpdateId): GetOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOTAUpdateRequest]
  }
  
  @scala.inline
  implicit class GetOTAUpdateRequestMutableBuilder[Self <: GetOTAUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
  }
}
