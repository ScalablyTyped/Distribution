package typings.awsSdkClientGlacierNode.typesJobParametersMod

import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobInputMod.UnmarshalledInventoryRetrievalJobInput
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledJobParameters extends JobParameters {
  /**
    * <p>Input parameters used for range inventory retrieval.</p>
    */
  @JSName("InventoryRetrievalParameters")
  var InventoryRetrievalParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledInventoryRetrievalJobInput] = js.undefined
  /**
    * <p>Contains information about the location where the select job results are stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledJobParameters: js.UndefOr[UnmarshalledOutputLocation] = js.undefined
  /**
    * <p>Contains the parameters that define a job.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledSelectParameters] = js.undefined
}

object UnmarshalledJobParameters {
  @scala.inline
  def apply(
    ArchiveId: String = null,
    Description: String = null,
    Format: String = null,
    InventoryRetrievalParameters: UnmarshalledInventoryRetrievalJobInput = null,
    OutputLocation: UnmarshalledOutputLocation = null,
    RetrievalByteRange: String = null,
    SNSTopic: String = null,
    SelectParameters: UnmarshalledSelectParameters = null,
    Tier: String = null,
    Type: String = null
  ): UnmarshalledJobParameters = {
    val __obj = js.Dynamic.literal()
    if (ArchiveId != null) __obj.updateDynamic("ArchiveId")(ArchiveId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (InventoryRetrievalParameters != null) __obj.updateDynamic("InventoryRetrievalParameters")(InventoryRetrievalParameters.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (RetrievalByteRange != null) __obj.updateDynamic("RetrievalByteRange")(RetrievalByteRange.asInstanceOf[js.Any])
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledJobParameters]
  }
}

