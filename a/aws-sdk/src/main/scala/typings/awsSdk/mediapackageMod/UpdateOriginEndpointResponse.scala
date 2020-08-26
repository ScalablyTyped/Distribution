package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOriginEndpointResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
    */
  var Arn: js.UndefOr[string] = js.native
  var Authorization: js.UndefOr[typings.awsSdk.mediapackageMod.Authorization] = js.native
  /**
    * The ID of the Channel the OriginEndpoint is associated with.
    */
  var ChannelId: js.UndefOr[string] = js.native
  var CmafPackage: js.UndefOr[typings.awsSdk.mediapackageMod.CmafPackage] = js.native
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackageMod.DashPackage] = js.native
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[string] = js.native
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackageMod.HlsPackage] = js.native
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * A short string appended to the end of the OriginEndpoint URL.
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
    * Maximum duration (seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[integer] = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackageMod.Tags] = js.native
  /**
    * Amount of delay (seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[integer] = js.native
  /**
    * The URL of the packaged OriginEndpoint for consumption.
    */
  var Url: js.UndefOr[string] = js.native
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[listOfString] = js.native
}

object UpdateOriginEndpointResponse {
  @scala.inline
  def apply(): UpdateOriginEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOriginEndpointResponse]
  }
  @scala.inline
  implicit class UpdateOriginEndpointResponseOps[Self <: UpdateOriginEndpointResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAuthorization(value: Authorization): Self = this.set("Authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("Authorization", js.undefined)
    @scala.inline
    def setChannelId(value: string): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("ChannelId", js.undefined)
    @scala.inline
    def setCmafPackage(value: CmafPackage): Self = this.set("CmafPackage", value.asInstanceOf[js.Any])
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
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
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTimeDelaySeconds(value: integer): Self = this.set("TimeDelaySeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeDelaySeconds: Self = this.set("TimeDelaySeconds", js.undefined)
    @scala.inline
    def setUrl(value: string): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    @scala.inline
    def setWhitelistVarargs(value: string*): Self = this.set("Whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: listOfString): Self = this.set("Whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelist: Self = this.set("Whitelist", js.undefined)
  }
  
}

