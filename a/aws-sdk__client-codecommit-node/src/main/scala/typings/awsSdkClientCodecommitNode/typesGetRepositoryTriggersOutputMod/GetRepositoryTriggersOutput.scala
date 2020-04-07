package typings.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.UnmarshalledRepositoryTrigger
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryTriggersOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The system-generated unique ID for the trigger.</p>
    */
  var configurationId: js.UndefOr[String] = js.undefined
  /**
    * <p>The JSON block of configuration information for each trigger.</p>
    */
  var triggers: js.UndefOr[js.Array[UnmarshalledRepositoryTrigger]] = js.undefined
}

object GetRepositoryTriggersOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    configurationId: String = null,
    triggers: js.Array[UnmarshalledRepositoryTrigger] = null
  ): GetRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryTriggersOutput]
  }
}

