package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOriginEndpointResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  var Authorization: js.UndefOr[typings.awsSdk.mediapackageMod.Authorization] = js.undefined
  
  /**
    * The ID of the Channel the OriginEndpoint is associated with.
    */
  var ChannelId: js.UndefOr[string] = js.undefined
  
  var CmafPackage: js.UndefOr[typings.awsSdk.mediapackageMod.CmafPackage] = js.undefined
  
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackageMod.DashPackage] = js.undefined
  
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackageMod.HlsPackage] = js.undefined
  
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * A short string appended to the end of the OriginEndpoint URL.
    */
  var ManifestName: js.UndefOr[string] = js.undefined
  
  var MssPackage: js.UndefOr[typings.awsSdk.mediapackageMod.MssPackage] = js.undefined
  
  /**
    * Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint
  may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be
  requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
    */
  var Origination: js.UndefOr[typings.awsSdk.mediapackageMod.Origination] = js.undefined
  
  /**
    * Maximum duration (seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[integer] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackageMod.Tags] = js.undefined
  
  /**
    * Amount of delay (seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * The URL of the packaged OriginEndpoint for consumption.
    */
  var Url: js.UndefOr[string] = js.undefined
  
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[listOfString] = js.undefined
}
object DescribeOriginEndpointResponse {
  
  @scala.inline
  def apply(): DescribeOriginEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOriginEndpointResponse]
  }
  
  @scala.inline
  implicit class DescribeOriginEndpointResponseMutableBuilder[Self <: DescribeOriginEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
    @scala.inline
    def setCmafPackage(value: CmafPackage): Self = StObject.set(x, "CmafPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmafPackageUndefined: Self = StObject.set(x, "CmafPackage", js.undefined)
    
    @scala.inline
    def setDashPackage(value: DashPackage): Self = StObject.set(x, "DashPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashPackageUndefined: Self = StObject.set(x, "DashPackage", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setHlsPackage(value: HlsPackage): Self = StObject.set(x, "HlsPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsPackageUndefined: Self = StObject.set(x, "HlsPackage", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setManifestName(value: string): Self = StObject.set(x, "ManifestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestNameUndefined: Self = StObject.set(x, "ManifestName", js.undefined)
    
    @scala.inline
    def setMssPackage(value: MssPackage): Self = StObject.set(x, "MssPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMssPackageUndefined: Self = StObject.set(x, "MssPackage", js.undefined)
    
    @scala.inline
    def setOrigination(value: Origination): Self = StObject.set(x, "Origination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginationUndefined: Self = StObject.set(x, "Origination", js.undefined)
    
    @scala.inline
    def setStartoverWindowSeconds(value: integer): Self = StObject.set(x, "StartoverWindowSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartoverWindowSecondsUndefined: Self = StObject.set(x, "StartoverWindowSeconds", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTimeDelaySeconds(value: integer): Self = StObject.set(x, "TimeDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDelaySecondsUndefined: Self = StObject.set(x, "TimeDelaySeconds", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setWhitelist(value: listOfString): Self = StObject.set(x, "Whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "Whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: string*): Self = StObject.set(x, "Whitelist", js.Array(value :_*))
  }
}
