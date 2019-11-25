package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSourceTableFeatureDetailsMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalSecondaryIndexInfoMod._UnmarshalledGlobalSecondaryIndexInfo
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreLocalSecondaryIndexInfoMod._UnmarshalledLocalSecondaryIndexInfo
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSSEDescriptionMod._UnmarshalledSSEDescription
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreStreamSpecificationMod._UnmarshalledStreamSpecification
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTimeToLiveDescriptionMod._UnmarshalledTimeToLiveDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSourceTableFeatureDetails extends _SourceTableFeatureDetails {
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes__UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[_UnmarshalledGlobalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes__UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[_UnmarshalledLocalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>The description of the server-side encryption status on the table when the backup was created.</p>
    */
  @JSName("SSEDescription")
  var SSEDescription__UnmarshalledSourceTableFeatureDetails: js.UndefOr[_UnmarshalledSSEDescription] = js.undefined
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  @JSName("StreamDescription")
  var StreamDescription__UnmarshalledSourceTableFeatureDetails: js.UndefOr[_UnmarshalledStreamSpecification] = js.undefined
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  @JSName("TimeToLiveDescription")
  var TimeToLiveDescription__UnmarshalledSourceTableFeatureDetails: js.UndefOr[_UnmarshalledTimeToLiveDescription] = js.undefined
}

object _UnmarshalledSourceTableFeatureDetails {
  @scala.inline
  def apply(
    GlobalSecondaryIndexes: js.Array[_UnmarshalledGlobalSecondaryIndexInfo] = null,
    LocalSecondaryIndexes: js.Array[_UnmarshalledLocalSecondaryIndexInfo] = null,
    SSEDescription: _UnmarshalledSSEDescription = null,
    StreamDescription: _UnmarshalledStreamSpecification = null,
    TimeToLiveDescription: _UnmarshalledTimeToLiveDescription = null
  ): _UnmarshalledSourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (StreamDescription != null) __obj.updateDynamic("StreamDescription")(StreamDescription.asInstanceOf[js.Any])
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSourceTableFeatureDetails]
  }
}

