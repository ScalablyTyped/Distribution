package typings.awsSdkClientGlacierNode.typesGlacierJobDescriptionMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ArchiveRetrieval
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Failed
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InProgress
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InventoryRetrieval
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Select
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Succeeded
import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobDescriptionMod.UnmarshalledInventoryRetrievalJobDescription
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGlacierJobDescription extends GlacierJobDescription {
  /**
    * <p>Parameters used for range inventory retrieval.</p>
    */
  @JSName("InventoryRetrievalParameters")
  var InventoryRetrievalParameters_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledInventoryRetrievalJobDescription] = js.undefined
  /**
    * <p>Contains the location where the data from the select job is stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledOutputLocation] = js.undefined
  /**
    * <p>Contains the parameters used for a select.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledSelectParameters] = js.undefined
}

object UnmarshalledGlacierJobDescription {
  @scala.inline
  def apply(
    Action: ArchiveRetrieval | InventoryRetrieval | Select | String = null,
    ArchiveId: String = null,
    ArchiveSHA256TreeHash: String = null,
    ArchiveSizeInBytes: Int | Double = null,
    Completed: js.UndefOr[Boolean] = js.undefined,
    CompletionDate: String = null,
    CreationDate: String = null,
    InventoryRetrievalParameters: UnmarshalledInventoryRetrievalJobDescription = null,
    InventorySizeInBytes: Int | Double = null,
    JobDescription: String = null,
    JobId: String = null,
    JobOutputPath: String = null,
    OutputLocation: UnmarshalledOutputLocation = null,
    RetrievalByteRange: String = null,
    SHA256TreeHash: String = null,
    SNSTopic: String = null,
    SelectParameters: UnmarshalledSelectParameters = null,
    StatusCode: InProgress | Succeeded | Failed | String = null,
    StatusMessage: String = null,
    Tier: String = null,
    VaultARN: String = null
  ): UnmarshalledGlacierJobDescription = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ArchiveId != null) __obj.updateDynamic("ArchiveId")(ArchiveId.asInstanceOf[js.Any])
    if (ArchiveSHA256TreeHash != null) __obj.updateDynamic("ArchiveSHA256TreeHash")(ArchiveSHA256TreeHash.asInstanceOf[js.Any])
    if (ArchiveSizeInBytes != null) __obj.updateDynamic("ArchiveSizeInBytes")(ArchiveSizeInBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(Completed)) __obj.updateDynamic("Completed")(Completed.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (InventoryRetrievalParameters != null) __obj.updateDynamic("InventoryRetrievalParameters")(InventoryRetrievalParameters.asInstanceOf[js.Any])
    if (InventorySizeInBytes != null) __obj.updateDynamic("InventorySizeInBytes")(InventorySizeInBytes.asInstanceOf[js.Any])
    if (JobDescription != null) __obj.updateDynamic("JobDescription")(JobDescription.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobOutputPath != null) __obj.updateDynamic("JobOutputPath")(JobOutputPath.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (RetrievalByteRange != null) __obj.updateDynamic("RetrievalByteRange")(RetrievalByteRange.asInstanceOf[js.Any])
    if (SHA256TreeHash != null) __obj.updateDynamic("SHA256TreeHash")(SHA256TreeHash.asInstanceOf[js.Any])
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlacierJobDescription]
  }
}

