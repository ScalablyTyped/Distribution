package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashConfigurationForPut extends js.Object {
  
  /**
    * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates the Location tag with the URL for manifest update requests, to be used by players that don't support sticky redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests, and you are either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value. 
    */
  var MpdLocation: js.UndefOr[string] = js.native
  
  /**
    * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD. 
    */
  var OriginManifestType: js.UndefOr[typings.awsSdk.mediatailorMod.OriginManifestType] = js.native
}
object DashConfigurationForPut {
  
  @scala.inline
  def apply(): DashConfigurationForPut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashConfigurationForPut]
  }
  
  @scala.inline
  implicit class DashConfigurationForPutOps[Self <: DashConfigurationForPut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMpdLocation(value: string): Self = this.set("MpdLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMpdLocation: Self = this.set("MpdLocation", js.undefined)
    
    @scala.inline
    def setOriginManifestType(value: OriginManifestType): Self = this.set("OriginManifestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginManifestType: Self = this.set("OriginManifestType", js.undefined)
  }
}
