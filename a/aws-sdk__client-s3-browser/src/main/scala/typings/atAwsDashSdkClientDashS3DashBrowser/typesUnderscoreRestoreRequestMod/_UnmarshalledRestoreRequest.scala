package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRestoreRequestMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Bulk
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Expedited
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.SELECT
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Standard_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGlacierJobParametersMod._UnmarshalledGlacierJobParameters
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOutputLocationMod._UnmarshalledOutputLocation
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSelectParametersMod._UnmarshalledSelectParameters
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
    Tier: Standard_ | Bulk | Expedited | String = null,
    Type: SELECT | String = null
  ): _UnmarshalledRestoreRequest = {
    val __obj = js.Dynamic.literal()
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlacierJobParameters != null) __obj.updateDynamic("GlacierJobParameters")(GlacierJobParameters.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledRestoreRequest]
  }
}

