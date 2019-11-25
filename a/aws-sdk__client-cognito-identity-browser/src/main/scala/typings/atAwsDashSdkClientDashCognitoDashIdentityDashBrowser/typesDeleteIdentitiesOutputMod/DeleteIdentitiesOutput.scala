package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeleteIdentitiesOutputMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreUnprocessedIdentityIdMod._UnmarshalledUnprocessedIdentityId
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIdentitiesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.</p>
    */
  var UnprocessedIdentityIds: js.UndefOr[js.Array[_UnmarshalledUnprocessedIdentityId]] = js.undefined
}

object DeleteIdentitiesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    UnprocessedIdentityIds: js.Array[_UnmarshalledUnprocessedIdentityId] = null
  ): DeleteIdentitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (UnprocessedIdentityIds != null) __obj.updateDynamic("UnprocessedIdentityIds")(UnprocessedIdentityIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentitiesOutput]
  }
}

