package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOriginEndpointRequest extends js.Object {
  
  var Authorization: js.UndefOr[typings.awsSdk.mediapackageMod.Authorization] = js.native
  
  var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.native
  
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackageMod.DashPackage] = js.native
  
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[string] = js.native
  
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackageMod.HlsPackage] = js.native
  
  /**
    * The ID of the OriginEndpoint to update.
    */
  var Id: string = js.native
  
  /**
    * A short string that will be appended to the end of the Endpoint URL.
    */
  var ManifestName: js.UndefOr[string] = js.native
  
  var MssPackage: js.UndefOr[typings.awsSdk.mediapackageMod.MssPackage] = js.native
  
  /**
    * Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint
  may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be
  requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
    */
  var Origination: js.UndefOr[typings.awsSdk.mediapackageMod.Origination] = js.native
  
  /**
    * Maximum duration (in seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[integer] = js.native
  
  /**
    * Amount of delay (in seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[integer] = js.native
  
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[listOfString] = js.native
}
object UpdateOriginEndpointRequest {
  
  @scala.inline
  def apply(Id: string): UpdateOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOriginEndpointRequest]
  }
  
  @scala.inline
  implicit class UpdateOriginEndpointRequestOps[Self <: UpdateOriginEndpointRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization(value: Authorization): Self = this.set("Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorization: Self = this.set("Authorization", js.undefined)
    
    @scala.inline
    def setCmafPackage(value: CmafPackageCreateOrUpdateParameters): Self = this.set("CmafPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmafPackage: Self = this.set("CmafPackage", js.undefined)
    
    @scala.inline
    def setDashPackage(value: DashPackage): Self = this.set("DashPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashPackage: Self = this.set("DashPackage", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setHlsPackage(value: HlsPackage): Self = this.set("HlsPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsPackage: Self = this.set("HlsPackage", js.undefined)
    
    @scala.inline
    def setManifestName(value: string): Self = this.set("ManifestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestName: Self = this.set("ManifestName", js.undefined)
    
    @scala.inline
    def setMssPackage(value: MssPackage): Self = this.set("MssPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMssPackage: Self = this.set("MssPackage", js.undefined)
    
    @scala.inline
    def setOrigination(value: Origination): Self = this.set("Origination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigination: Self = this.set("Origination", js.undefined)
    
    @scala.inline
    def setStartoverWindowSeconds(value: integer): Self = this.set("StartoverWindowSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartoverWindowSeconds: Self = this.set("StartoverWindowSeconds", js.undefined)
    
    @scala.inline
    def setTimeDelaySeconds(value: integer): Self = this.set("TimeDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeDelaySeconds: Self = this.set("TimeDelaySeconds", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: string*): Self = this.set("Whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: listOfString): Self = this.set("Whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("Whitelist", js.undefined)
  }
}
