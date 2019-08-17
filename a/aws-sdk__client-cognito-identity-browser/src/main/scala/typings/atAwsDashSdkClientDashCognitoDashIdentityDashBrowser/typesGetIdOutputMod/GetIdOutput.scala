package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdOutputMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}

object GetIdOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, IdentityId: String = null): GetIdOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    __obj.asInstanceOf[GetIdOutput]
  }
}

