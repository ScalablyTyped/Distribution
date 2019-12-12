package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignsResponseMod._UnmarshalledCampaignsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/GetCampaignVersionsOutput", JSImport.Namespace)
@js.native
object typesGetCampaignVersionsOutputMod extends js.Object {
  @js.native
  trait GetCampaignVersionsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * List of available campaigns.
      */
    var CampaignsResponse: _UnmarshalledCampaignsResponse = js.native
  }
  
}

