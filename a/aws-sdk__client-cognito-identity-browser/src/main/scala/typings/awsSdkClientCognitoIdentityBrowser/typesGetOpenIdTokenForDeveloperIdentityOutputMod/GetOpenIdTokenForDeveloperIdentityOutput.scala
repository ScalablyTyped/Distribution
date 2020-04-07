package typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenIdTokenForDeveloperIdentityOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  /**
    * <p>An OpenID token.</p>
    */
  var Token: js.UndefOr[String] = js.undefined
}

object GetOpenIdTokenForDeveloperIdentityOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, IdentityId: String = null, Token: String = null): GetOpenIdTokenForDeveloperIdentityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityOutput]
  }
}

