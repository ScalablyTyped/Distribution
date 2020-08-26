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
    * S3 Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.
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
    * S3 Glacier retrieval tier at which the restore will be processed.
    */
  var Tier: js.UndefOr[typings.awsSdk.s3Mod.Tier] = js.native
  /**
    * Type of restore request.
    */
  var Type: js.UndefOr[RestoreRequestType] = js.native
}

object RestoreRequest {
  @scala.inline
  def apply(): RestoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreRequest]
  }
  @scala.inline
  implicit class RestoreRequestOps[Self <: RestoreRequest] (val x: Self) extends AnyVal {
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
    def setDays(value: Days): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("Days", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGlacierJobParameters(value: GlacierJobParameters): Self = this.set("GlacierJobParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlacierJobParameters: Self = this.set("GlacierJobParameters", js.undefined)
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    @scala.inline
    def setSelectParameters(value: SelectParameters): Self = this.set("SelectParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectParameters: Self = this.set("SelectParameters", js.undefined)
    @scala.inline
    def setTier(value: Tier): Self = this.set("Tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    @scala.inline
    def setType(value: RestoreRequestType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

