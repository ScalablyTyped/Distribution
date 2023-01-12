package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Bulk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Expedited
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SELECT
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Standard_
import typings.awsSdkClientS3Browser.typesGlacierJobParametersMod.GlacierJobParameters
import typings.awsSdkClientS3Browser.typesGlacierJobParametersMod.UnmarshalledGlacierJobParameters
import typings.awsSdkClientS3Browser.typesOutputLocationMod.OutputLocation
import typings.awsSdkClientS3Browser.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientS3Browser.typesSelectParametersMod.SelectParameters
import typings.awsSdkClientS3Browser.typesSelectParametersMod.UnmarshalledSelectParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreRequestMod {
  
  trait RestoreRequest extends StObject {
    
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
    var GlacierJobParameters: js.UndefOr[typings.awsSdkClientS3Browser.typesGlacierJobParametersMod.GlacierJobParameters] = js.undefined
    
    /**
      * <p>Describes the location where the restore job's output is stored.</p>
      */
    var OutputLocation: js.UndefOr[typings.awsSdkClientS3Browser.typesOutputLocationMod.OutputLocation] = js.undefined
    
    /**
      * <p>Describes the parameters for Select job types.</p>
      */
    var SelectParameters: js.UndefOr[typings.awsSdkClientS3Browser.typesSelectParametersMod.SelectParameters] = js.undefined
    
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
    
    inline def apply(): RestoreRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestoreRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestoreRequest] (val x: Self) extends AnyVal {
      
      inline def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setGlacierJobParameters(value: GlacierJobParameters): Self = StObject.set(x, "GlacierJobParameters", value.asInstanceOf[js.Any])
      
      inline def setGlacierJobParametersUndefined: Self = StObject.set(x, "GlacierJobParameters", js.undefined)
      
      inline def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
      
      inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
      
      inline def setSelectParameters(value: SelectParameters): Self = StObject.set(x, "SelectParameters", value.asInstanceOf[js.Any])
      
      inline def setSelectParametersUndefined: Self = StObject.set(x, "SelectParameters", js.undefined)
      
      inline def setTier(value: Standard_ | Bulk | Expedited | String): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
      
      inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
      
      inline def setType(value: SELECT | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait UnmarshalledRestoreRequest
    extends StObject
       with RestoreRequest {
    
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
    
    inline def apply(): UnmarshalledRestoreRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRestoreRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledRestoreRequest] (val x: Self) extends AnyVal {
      
      inline def setGlacierJobParameters(value: UnmarshalledGlacierJobParameters): Self = StObject.set(x, "GlacierJobParameters", value.asInstanceOf[js.Any])
      
      inline def setGlacierJobParametersUndefined: Self = StObject.set(x, "GlacierJobParameters", js.undefined)
      
      inline def setOutputLocation(value: UnmarshalledOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
      
      inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
      
      inline def setSelectParameters(value: UnmarshalledSelectParameters): Self = StObject.set(x, "SelectParameters", value.asInstanceOf[js.Any])
      
      inline def setSelectParametersUndefined: Self = StObject.set(x, "SelectParameters", js.undefined)
    }
  }
}
