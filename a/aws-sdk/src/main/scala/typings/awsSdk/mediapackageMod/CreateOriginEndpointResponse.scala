package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOriginEndpointResponse extends js.Object {
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

object CreateOriginEndpointResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    Authorization: Authorization = null,
    ChannelId: string = null,
    CmafPackage: CmafPackage = null,
    DashPackage: DashPackage = null,
    Description: string = null,
    HlsPackage: HlsPackage = null,
    Id: string = null,
    ManifestName: string = null,
    MssPackage: MssPackage = null,
    Origination: Origination = null,
    StartoverWindowSeconds: js.UndefOr[integer] = js.undefined,
    Tags: Tags = null,
    TimeDelaySeconds: js.UndefOr[integer] = js.undefined,
    Url: string = null,
    Whitelist: listOfString = null
  ): CreateOriginEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId.asInstanceOf[js.Any])
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage.asInstanceOf[js.Any])
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName.asInstanceOf[js.Any])
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage.asInstanceOf[js.Any])
    if (Origination != null) __obj.updateDynamic("Origination")(Origination.asInstanceOf[js.Any])
    if (!js.isUndefined(StartoverWindowSeconds)) __obj.updateDynamic("StartoverWindowSeconds")(StartoverWindowSeconds.get.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeDelaySeconds)) __obj.updateDynamic("TimeDelaySeconds")(TimeDelaySeconds.get.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (Whitelist != null) __obj.updateDynamic("Whitelist")(Whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOriginEndpointResponse]
  }
}

