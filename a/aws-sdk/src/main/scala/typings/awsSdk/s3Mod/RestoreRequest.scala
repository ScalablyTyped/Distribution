package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreRequest extends js.Object {
  /**
    * Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.
    */
  var Days: js.UndefOr[typings.awsSdk.s3Mod.Days] = js.native
  /**
    * The optional description for the job.
    */
  var Description: js.UndefOr[typings.awsSdk.s3Mod.Description] = js.native
  /**
    * Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.
    */
  var GlacierJobParameters: js.UndefOr[typings.awsSdk.s3Mod.GlacierJobParameters] = js.native
  /**
    * Describes the location where the restore job's output is stored.
    */
  var OutputLocation: js.UndefOr[typings.awsSdk.s3Mod.OutputLocation] = js.native
  /**
    * Describes the parameters for Select job types.
    */
  var SelectParameters: js.UndefOr[typings.awsSdk.s3Mod.SelectParameters] = js.native
  /**
    * Glacier retrieval tier at which the restore will be processed.
    */
  var Tier: js.UndefOr[typings.awsSdk.s3Mod.Tier] = js.native
  /**
    * Type of restore request.
    */
  var Type: js.UndefOr[RestoreRequestType] = js.native
}

object RestoreRequest {
  @scala.inline
  def apply(
    Days: Int | Double = null,
    Description: Description = null,
    GlacierJobParameters: GlacierJobParameters = null,
    OutputLocation: OutputLocation = null,
    SelectParameters: SelectParameters = null,
    Tier: Tier = null,
    Type: RestoreRequestType = null
  ): RestoreRequest = {
    val __obj = js.Dynamic.literal()
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlacierJobParameters != null) __obj.updateDynamic("GlacierJobParameters")(GlacierJobParameters.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreRequest]
  }
}

