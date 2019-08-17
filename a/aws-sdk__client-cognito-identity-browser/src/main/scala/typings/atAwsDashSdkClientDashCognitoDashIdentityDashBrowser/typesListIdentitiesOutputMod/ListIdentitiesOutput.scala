package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentitiesOutputMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreIdentityDescriptionMod._UnmarshalledIdentityDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var Identities: js.UndefOr[js.Array[_UnmarshalledIdentityDescription]] = js.undefined
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
    Identities: js.Array[_UnmarshalledIdentityDescription] = null,
    IdentityPoolId: String = null,
    NextToken: String = null
  ): ListIdentitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Identities != null) __obj.updateDynamic("Identities")(Identities)
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentitiesOutput]
  }
}

