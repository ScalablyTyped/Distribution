package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Bulk
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Expedited
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SELECT
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Standard_
import typings.awsSdkClientS3Node.typesGlacierJobParametersMod.GlacierJobParameters
import typings.awsSdkClientS3Node.typesGlacierJobParametersMod.UnmarshalledGlacierJobParameters
import typings.awsSdkClientS3Node.typesOutputLocationMod.OutputLocation
import typings.awsSdkClientS3Node.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientS3Node.typesSelectParametersMod.SelectParameters
import typings.awsSdkClientS3Node.typesSelectParametersMod.UnmarshalledSelectParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreRequestMod {
  
  @js.native
  trait RestoreRequest extends StObject {
    
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
    var GlacierJobParameters: js.UndefOr[typings.awsSdkClientS3Node.typesGlacierJobParametersMod.GlacierJobParameters] = js.native
    
    /**
      * <p>Describes the location where the restore job's output is stored.</p>
      */
    var OutputLocation: js.UndefOr[typings.awsSdkClientS3Node.typesOutputLocationMod.OutputLocation] = js.native
    
    /**
      * <p>Describes the parameters for Select job types.</p>
      */
    var SelectParameters: js.UndefOr[typings.awsSdkClientS3Node.typesSelectParametersMod.SelectParameters] = js.native
    
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
    implicit class RestoreRequestMutableBuilder[Self <: RestoreRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
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
      def setTier(value: Standard_ | Bulk | Expedited | String): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
      
      @scala.inline
      def setType(value: SELECT | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledRestoreRequest extends RestoreRequest {
    
    /**
      * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
      */
    @JSName("GlacierJobParameters")
    var GlacierJobParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledGlacierJobParameters] = js.native
    
    /**
      * <p>Describes the location where the restore job's output is stored.</p>
      */
    @JSName("OutputLocation")
    var OutputLocation_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledOutputLocation] = js.native
    
    /**
      * <p>Describes the parameters for Select job types.</p>
      */
    @JSName("SelectParameters")
    var SelectParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledSelectParameters] = js.native
  }
  object UnmarshalledRestoreRequest {
    
    @scala.inline
    def apply(): UnmarshalledRestoreRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRestoreRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledRestoreRequestMutableBuilder[Self <: UnmarshalledRestoreRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlacierJobParameters(value: UnmarshalledGlacierJobParameters): Self = StObject.set(x, "GlacierJobParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlacierJobParametersUndefined: Self = StObject.set(x, "GlacierJobParameters", js.undefined)
      
      @scala.inline
      def setOutputLocation(value: UnmarshalledOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
      
      @scala.inline
      def setSelectParameters(value: UnmarshalledSelectParameters): Self = StObject.set(x, "SelectParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectParametersUndefined: Self = StObject.set(x, "SelectParameters", js.undefined)
    }
  }
}
