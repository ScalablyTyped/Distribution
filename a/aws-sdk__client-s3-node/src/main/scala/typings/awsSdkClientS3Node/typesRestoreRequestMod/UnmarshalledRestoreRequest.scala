package typings.awsSdkClientS3Node.typesRestoreRequestMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Bulk
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Expedited
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SELECT
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Standard_
import typings.awsSdkClientS3Node.typesGlacierJobParametersMod.UnmarshalledGlacierJobParameters
import typings.awsSdkClientS3Node.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientS3Node.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRestoreRequest extends RestoreRequest {
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  @JSName("GlacierJobParameters")
  var GlacierJobParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledGlacierJobParameters] = js.undefined
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledOutputLocation] = js.undefined
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledSelectParameters] = js.undefined
}

object UnmarshalledRestoreRequest {
  @scala.inline
  def apply(
    Days: js.UndefOr[Double] = js.undefined,
    Description: String = null,
    GlacierJobParameters: UnmarshalledGlacierJobParameters = null,
    OutputLocation: UnmarshalledOutputLocation = null,
    SelectParameters: UnmarshalledSelectParameters = null,
    Tier: Standard_ | Bulk | Expedited | String = null,
    Type: SELECT | String = null
  ): UnmarshalledRestoreRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days.get.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlacierJobParameters != null) __obj.updateDynamic("GlacierJobParameters")(GlacierJobParameters.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRestoreRequest]
  }
}

