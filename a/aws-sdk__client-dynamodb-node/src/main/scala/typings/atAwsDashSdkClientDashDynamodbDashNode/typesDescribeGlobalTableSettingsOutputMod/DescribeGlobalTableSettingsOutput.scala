package typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeGlobalTableSettingsOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaSettingsDescriptionMod._UnmarshalledReplicaSettingsDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var ReplicaSettings: js.UndefOr[js.Array[_UnmarshalledReplicaSettingsDescription]] = js.undefined
}

object DescribeGlobalTableSettingsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    GlobalTableName: String = null,
    ReplicaSettings: js.Array[_UnmarshalledReplicaSettingsDescription] = null
  ): DescribeGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName)
    if (ReplicaSettings != null) __obj.updateDynamic("ReplicaSettings")(ReplicaSettings)
    __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
  }
}

