package typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsDescriptionMod.UnmarshalledReplicaSettingsDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalTableSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The name of the global table.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The region specific settings for the global table.</p>
    */
  var ReplicaSettings: js.UndefOr[js.Array[UnmarshalledReplicaSettingsDescription]] = js.undefined
}

object DescribeGlobalTableSettingsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    GlobalTableName: String = null,
    ReplicaSettings: js.Array[UnmarshalledReplicaSettingsDescription] = null
  ): DescribeGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (ReplicaSettings != null) __obj.updateDynamic("ReplicaSettings")(ReplicaSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
  }
}

