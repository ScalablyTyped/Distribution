package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreRequest extends StObject {
  
  /**
    * Lifetime of the active copy in days. Do not use with restores that specify OutputLocation. The Days element is required for regular restores, and must not be provided for select requests.
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
    * Retrieval tier at which the restore will be processed.
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
  implicit class RestoreRequestMutableBuilder[Self <: RestoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Days): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlacierJobParameters(value: GlacierJobParameters): Self = StObject.set(x, "GlacierJobParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlacierJobParametersUndefined: Self = StObject.set(x, "GlacierJobParameters", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    @scala.inline
    def setSelectParameters(value: SelectParameters): Self = StObject.set(x, "SelectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectParametersUndefined: Self = StObject.set(x, "SelectParameters", js.undefined)
    
    @scala.inline
    def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    @scala.inline
    def setType(value: RestoreRequestType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
