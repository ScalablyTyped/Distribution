package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSourceTableFeatureDetailsMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalSecondaryIndexInfoMod._GlobalSecondaryIndexInfo
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreLocalSecondaryIndexInfoMod._LocalSecondaryIndexInfo
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSSEDescriptionMod._SSEDescription
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreStreamSpecificationMod._StreamSpecification
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTimeToLiveDescriptionMod._TimeToLiveDescription
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SourceTableFeatureDetails extends js.Object {
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[_GlobalSecondaryIndexInfo] | Iterable[_GlobalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
    */
  var LocalSecondaryIndexes: js.UndefOr[js.Array[_LocalSecondaryIndexInfo] | Iterable[_LocalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>The description of the server-side encryption status on the table when the backup was created.</p>
    */
  var SSEDescription: js.UndefOr[_SSEDescription] = js.undefined
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  var StreamDescription: js.UndefOr[_StreamSpecification] = js.undefined
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  var TimeToLiveDescription: js.UndefOr[_TimeToLiveDescription] = js.undefined
}

object _SourceTableFeatureDetails {
  @scala.inline
  def apply(
    GlobalSecondaryIndexes: js.Array[_GlobalSecondaryIndexInfo] | Iterable[_GlobalSecondaryIndexInfo] = null,
    LocalSecondaryIndexes: js.Array[_LocalSecondaryIndexInfo] | Iterable[_LocalSecondaryIndexInfo] = null,
    SSEDescription: _SSEDescription = null,
    StreamDescription: _StreamSpecification = null,
    TimeToLiveDescription: _TimeToLiveDescription = null
  ): _SourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (StreamDescription != null) __obj.updateDynamic("StreamDescription")(StreamDescription.asInstanceOf[js.Any])
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SourceTableFeatureDetails]
  }
}

