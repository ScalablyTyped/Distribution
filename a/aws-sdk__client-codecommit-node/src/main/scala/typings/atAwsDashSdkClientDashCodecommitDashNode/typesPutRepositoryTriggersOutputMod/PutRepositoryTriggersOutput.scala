package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutRepositoryTriggersOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRepositoryTriggersOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The system-generated unique ID for the create or update operation.</p>
    */
  var configurationId: js.UndefOr[String] = js.undefined
}

object PutRepositoryTriggersOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, configurationId: String = null): PutRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRepositoryTriggersOutput]
  }
}

