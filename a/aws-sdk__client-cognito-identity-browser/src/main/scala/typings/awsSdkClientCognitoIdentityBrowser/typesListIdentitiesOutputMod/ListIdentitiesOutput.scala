package typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod.UnmarshalledIdentityDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentitiesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An object containing a set of identities and associated mappings.</p>
    */
  var Identities: js.UndefOr[js.Array[UnmarshalledIdentityDescription]] = js.undefined
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListIdentitiesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Identities: js.Array[UnmarshalledIdentityDescription] = null,
    IdentityPoolId: String = null,
    NextToken: String = null
  ): ListIdentitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Identities != null) __obj.updateDynamic("Identities")(Identities.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesOutput]
  }
}

