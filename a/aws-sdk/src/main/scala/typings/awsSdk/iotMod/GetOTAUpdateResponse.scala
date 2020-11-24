package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOTAUpdateResponse extends js.Object {
  
  /**
    * The OTA update info.
    */
  var otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.native
}
object GetOTAUpdateResponse {
  
  @scala.inline
  def apply(): GetOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOTAUpdateResponse]
  }
  
  @scala.inline
  implicit class GetOTAUpdateResponseOps[Self <: GetOTAUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOtaUpdateInfo(value: OTAUpdateInfo): Self = this.set("otaUpdateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateInfo: Self = this.set("otaUpdateInfo", js.undefined)
  }
}
