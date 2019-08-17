package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRestoreRequestMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Bulk
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Expedited
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.SELECT
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Standard
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGlacierJobParametersMod._UnmarshalledGlacierJobParameters
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOutputLocationMod._UnmarshalledOutputLocation
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSelectParametersMod._UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRestoreRequest extends _RestoreRequest {
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  @JSName("GlacierJobParameters")
  var GlacierJobParameters__UnmarshalledRestoreRequest: js.UndefOr[_UnmarshalledGlacierJobParameters] = js.undefined
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation__UnmarshalledRestoreRequest: js.UndefOr[_UnmarshalledOutputLocation] = js.undefined
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters__UnmarshalledRestoreRequest: js.UndefOr[_UnmarshalledSelectParameters] = js.undefined
}

object _UnmarshalledRestoreRequest {
  @scala.inline
  def apply(
    Days: Int | Double = null,
    Description: String = null,
    GlacierJobParameters: _UnmarshalledGlacierJobParameters = null,
    OutputLocation: _UnmarshalledOutputLocation = null,
    SelectParameters: _UnmarshalledSelectParameters = null,
    Tier: Standard | Bulk | Expedited | String = null,
    Type: SELECT | String = null
  ): _UnmarshalledRestoreRequest = {
    val __obj = js.Dynamic.literal()
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GlacierJobParameters != null) __obj.updateDynamic("GlacierJobParameters")(GlacierJobParameters)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledRestoreRequest]
  }
}

