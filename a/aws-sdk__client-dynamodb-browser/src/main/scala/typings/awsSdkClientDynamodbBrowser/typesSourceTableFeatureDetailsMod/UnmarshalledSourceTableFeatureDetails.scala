package typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod

import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexInfoMod.UnmarshalledGlobalSecondaryIndexInfo
import typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexInfoMod.UnmarshalledLocalSecondaryIndexInfo
import typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.UnmarshalledSSEDescription
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSourceTableFeatureDetails extends SourceTableFeatureDetails {
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexInfo]] = js.undefined
  /**
    * <p>The description of the server-side encryption status on the table when the backup was created.</p>
    */
  @JSName("SSEDescription")
  var SSEDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledSSEDescription] = js.undefined
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  @JSName("StreamDescription")
  var StreamDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledStreamSpecification] = js.undefined
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  @JSName("TimeToLiveDescription")
  var TimeToLiveDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.undefined
}

object UnmarshalledSourceTableFeatureDetails {
  @scala.inline
  def apply(
    GlobalSecondaryIndexes: js.Array[UnmarshalledGlobalSecondaryIndexInfo] = null,
    LocalSecondaryIndexes: js.Array[UnmarshalledLocalSecondaryIndexInfo] = null,
    SSEDescription: UnmarshalledSSEDescription = null,
    StreamDescription: UnmarshalledStreamSpecification = null,
    TimeToLiveDescription: UnmarshalledTimeToLiveDescription = null
  ): UnmarshalledSourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (LocalSecondaryIndexes != null) __obj.updateDynamic("LocalSecondaryIndexes")(LocalSecondaryIndexes.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (StreamDescription != null) __obj.updateDynamic("StreamDescription")(StreamDescription.asInstanceOf[js.Any])
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSourceTableFeatureDetails]
  }
}

