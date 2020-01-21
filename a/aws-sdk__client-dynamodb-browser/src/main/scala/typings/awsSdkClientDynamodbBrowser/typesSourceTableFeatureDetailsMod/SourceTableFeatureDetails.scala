package typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod

import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexInfoMod.GlobalSecondaryIndexInfo
import typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexInfoMod.LocalSecondaryIndexInfo
import typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.SSEDescription
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.TimeToLiveDescription
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTableFeatureDetails extends js.Object {
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndexInfo] | Iterable[GlobalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
    */
  var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndexInfo] | Iterable[LocalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>The description of the server-side encryption status on the table when the backup was created.</p>
    */
  var SSEDescription: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.SSEDescription] = js.undefined
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  var TimeToLiveDescription: js.UndefOr[
    typings.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.TimeToLiveDescription
  ] = js.undefined
}

object SourceTableFeatureDetails {
  @scala.inline
  def apply(
    GlobalSecondaryIndexes: js.Array[GlobalSecondaryIndexInfo] | Iterable[GlobalSecondaryIndexInfo] = null,
    LocalSecondaryIndexes: js.Array[LocalSecondaryIndexInfo] | Iterable[LocalSecondaryIndexInfo] = null,
    SSEDescription: SSEDescription = null,
    StreamDescription: StreamSpecification = null,
    TimeToLiveDescription: TimeToLiveDescription = null
  ): SourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (StreamDescription != null) __obj.updateDynamic("StreamDescription")(StreamDescription.asInstanceOf[js.Any])
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableFeatureDetails]
  }
}

