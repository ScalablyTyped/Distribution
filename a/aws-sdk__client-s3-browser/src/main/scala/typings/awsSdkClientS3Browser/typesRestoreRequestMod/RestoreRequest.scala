package typings.awsSdkClientS3Browser.typesRestoreRequestMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Bulk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Expedited
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SELECT
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Standard_
import typings.awsSdkClientS3Browser.typesGlacierJobParametersMod.GlacierJobParameters
import typings.awsSdkClientS3Browser.typesOutputLocationMod.OutputLocation
import typings.awsSdkClientS3Browser.typesSelectParametersMod.SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreRequest extends js.Object {
  
  /**
    * <p>Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.</p>
    */
  var Days: js.UndefOr[Double] = js.native
  
  /**
    * <p>The optional description for the job.</p>
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  var GlacierJobParameters: js.UndefOr[typings.awsSdkClientS3Browser.typesGlacierJobParametersMod.GlacierJobParameters] = js.native
  
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  var OutputLocation: js.UndefOr[typings.awsSdkClientS3Browser.typesOutputLocationMod.OutputLocation] = js.native
  
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  var SelectParameters: js.UndefOr[typings.awsSdkClientS3Browser.typesSelectParametersMod.SelectParameters] = js.native
  
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: js.UndefOr[Standard_ | Bulk | Expedited | String] = js.native
  
  /**
    * <p>Type of restore request.</p>
    */
  var Type: js.UndefOr[SELECT | String] = js.native
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
    def setDays(value: Double): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("Days", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
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
    def setTier(value: Standard_ | Bulk | Expedited | String): Self = this.set("Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    
    @scala.inline
    def setType(value: SELECT | String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
