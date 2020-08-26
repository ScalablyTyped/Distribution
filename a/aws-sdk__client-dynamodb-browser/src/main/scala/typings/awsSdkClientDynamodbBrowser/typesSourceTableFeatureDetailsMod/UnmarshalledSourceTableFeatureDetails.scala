package typings.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod

import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexInfoMod.UnmarshalledGlobalSecondaryIndexInfo
import typings.awsSdkClientDynamodbBrowser.typesLocalSecondaryIndexInfoMod.UnmarshalledLocalSecondaryIndexInfo
import typings.awsSdkClientDynamodbBrowser.typesSsedescriptionMod.UnmarshalledSSEDescription
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSourceTableFeatureDetails extends SourceTableFeatureDetails {
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
    */
  @JSName("GlobalSecondaryIndexes")
  var GlobalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexInfo]] = js.native
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
    */
  @JSName("LocalSecondaryIndexes")
  var LocalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexInfo]] = js.native
  /**
    * <p>The description of the server-side encryption status on the table when the backup was created.</p>
    */
  @JSName("SSEDescription")
  var SSEDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledSSEDescription] = js.native
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  @JSName("StreamDescription")
  var StreamDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledStreamSpecification] = js.native
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  @JSName("TimeToLiveDescription")
  var TimeToLiveDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.native
}

object UnmarshalledSourceTableFeatureDetails {
  @scala.inline
  def apply(): UnmarshalledSourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSourceTableFeatureDetails]
  }
  @scala.inline
  implicit class UnmarshalledSourceTableFeatureDetailsOps[Self <: UnmarshalledSourceTableFeatureDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: UnmarshalledGlobalSecondaryIndexInfo*): Self = this.set("GlobalSecondaryIndexes", js.Array(value :_*))
    @scala.inline
    def setGlobalSecondaryIndexes(value: js.Array[UnmarshalledGlobalSecondaryIndexInfo]): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: UnmarshalledLocalSecondaryIndexInfo*): Self = this.set("LocalSecondaryIndexes", js.Array(value :_*))
    @scala.inline
    def setLocalSecondaryIndexes(value: js.Array[UnmarshalledLocalSecondaryIndexInfo]): Self = this.set("LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSecondaryIndexes: Self = this.set("LocalSecondaryIndexes", js.undefined)
    @scala.inline
    def setSSEDescription(value: UnmarshalledSSEDescription): Self = this.set("SSEDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEDescription: Self = this.set("SSEDescription", js.undefined)
    @scala.inline
    def setStreamDescription(value: UnmarshalledStreamSpecification): Self = this.set("StreamDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamDescription: Self = this.set("StreamDescription", js.undefined)
    @scala.inline
    def setTimeToLiveDescription(value: UnmarshalledTimeToLiveDescription): Self = this.set("TimeToLiveDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLiveDescription: Self = this.set("TimeToLiveDescription", js.undefined)
  }
  
}

