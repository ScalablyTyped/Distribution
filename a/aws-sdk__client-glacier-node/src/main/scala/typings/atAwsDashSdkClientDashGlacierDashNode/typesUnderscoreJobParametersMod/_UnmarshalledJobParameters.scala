package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreJobParametersMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreInventoryRetrievalJobInputMod._UnmarshalledInventoryRetrievalJobInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreOutputLocationMod._UnmarshalledOutputLocation
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreSelectParametersMod._UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledJobParameters extends _JobParameters {
  /**
    * <p>Input parameters used for range inventory retrieval.</p>
    */
  @JSName("InventoryRetrievalParameters")
  var InventoryRetrievalParameters__UnmarshalledJobParameters: js.UndefOr[_UnmarshalledInventoryRetrievalJobInput] = js.undefined
  /**
    * <p>Contains information about the location where the select job results are stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation__UnmarshalledJobParameters: js.UndefOr[_UnmarshalledOutputLocation] = js.undefined
  /**
    * <p>Contains the parameters that define a job.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters__UnmarshalledJobParameters: js.UndefOr[_UnmarshalledSelectParameters] = js.undefined
}

object _UnmarshalledJobParameters {
  @scala.inline
  def apply(
    ArchiveId: String = null,
    Description: String = null,
    Format: String = null,
    InventoryRetrievalParameters: _UnmarshalledInventoryRetrievalJobInput = null,
    OutputLocation: _UnmarshalledOutputLocation = null,
    RetrievalByteRange: String = null,
    SNSTopic: String = null,
    SelectParameters: _UnmarshalledSelectParameters = null,
    Tier: String = null,
    Type: String = null
  ): _UnmarshalledJobParameters = {
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
    __obj.asInstanceOf[_UnmarshalledJobParameters]
  }
}

