package typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod.UnmarshalledCredentials
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsForIdentityOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Credentials for the provided identity ID.</p>
    */
  var Credentials: js.UndefOr[UnmarshalledCredentials] = js.undefined
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}

object GetCredentialsForIdentityOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Credentials: UnmarshalledCredentials = null,
    IdentityId: String = null
  ): GetCredentialsForIdentityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsForIdentityOutput]
  }
}

