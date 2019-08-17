package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenOutputMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenIdTokenOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  /**
    * <p>An OpenID token, valid for 15 minutes.</p>
    */
  var Token: js.UndefOr[String] = js.undefined
}

object GetOpenIdTokenOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, IdentityId: String = null, Token: String = null): GetOpenIdTokenOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetOpenIdTokenOutput]
  }
}

