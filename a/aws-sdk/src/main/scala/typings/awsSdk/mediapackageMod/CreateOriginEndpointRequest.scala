package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOriginEndpointRequest extends js.Object {
  var Authorization: js.UndefOr[typings.awsSdk.mediapackageMod.Authorization] = js.native
  /**
    * The ID of the Channel that the OriginEndpoint will be associated with.
  This cannot be changed after the OriginEndpoint is created.
    */
  var ChannelId: string = js.native
  var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.native
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackageMod.DashPackage] = js.native
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[string] = js.native
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackageMod.HlsPackage] = js.native
  /**
    * The ID of the OriginEndpoint.  The ID must be unique within the region
  and it cannot be changed after the OriginEndpoint is created.
    */
  var Id: string = js.native
  /**
    * A short string that will be used as the filename of the OriginEndpoint URL (defaults to "index").
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
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[listOfString] = js.native
}

object CreateOriginEndpointRequest {
  @scala.inline
  def apply(
    ChannelId: string,
    Id: string,
    Authorization: Authorization = null,
    CmafPackage: CmafPackageCreateOrUpdateParameters = null,
    DashPackage: DashPackage = null,
    Description: string = null,
    HlsPackage: HlsPackage = null,
    ManifestName: string = null,
    MssPackage: MssPackage = null,
    Origination: Origination = null,
    StartoverWindowSeconds: js.UndefOr[integer] = js.undefined,
    Tags: Tags = null,
    TimeDelaySeconds: js.UndefOr[integer] = js.undefined,
    Whitelist: listOfString = null
  ): CreateOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage.asInstanceOf[js.Any])
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage.asInstanceOf[js.Any])
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName.asInstanceOf[js.Any])
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage.asInstanceOf[js.Any])
    if (Origination != null) __obj.updateDynamic("Origination")(Origination.asInstanceOf[js.Any])
    if (!js.isUndefined(StartoverWindowSeconds)) __obj.updateDynamic("StartoverWindowSeconds")(StartoverWindowSeconds.get.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeDelaySeconds)) __obj.updateDynamic("TimeDelaySeconds")(TimeDelaySeconds.get.asInstanceOf[js.Any])
    if (Whitelist != null) __obj.updateDynamic("Whitelist")(Whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOriginEndpointRequest]
  }
}

