package typings.awsSdkClientS3Node.typesRestoreRequestMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Bulk
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Expedited
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SELECT
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Standard_
import typings.awsSdkClientS3Node.typesGlacierJobParametersMod.GlacierJobParameters
import typings.awsSdkClientS3Node.typesOutputLocationMod.OutputLocation
import typings.awsSdkClientS3Node.typesSelectParametersMod.SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreRequest extends js.Object {
  /**
    * <p>Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.</p>
    */
  var Days: js.UndefOr[Double] = js.undefined
  /**
    * <p>The optional description for the job.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  var GlacierJobParameters: js.UndefOr[typings.awsSdkClientS3Node.typesGlacierJobParametersMod.GlacierJobParameters] = js.undefined
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  var OutputLocation: js.UndefOr[typings.awsSdkClientS3Node.typesOutputLocationMod.OutputLocation] = js.undefined
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  var SelectParameters: js.UndefOr[typings.awsSdkClientS3Node.typesSelectParametersMod.SelectParameters] = js.undefined
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: js.UndefOr[Standard_ | Bulk | Expedited | String] = js.undefined
  /**
    * <p>Type of restore request.</p>
    */
  var Type: js.UndefOr[SELECT | String] = js.undefined
}

object RestoreRequest {
  @scala.inline
  def apply(
    Days: Int | Double = null,
    Description: String = null,
    GlacierJobParameters: GlacierJobParameters = null,
    OutputLocation: OutputLocation = null,
    SelectParameters: SelectParameters = null,
    Tier: Standard_ | Bulk | Expedited | String = null,
    Type: SELECT | String = null
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

