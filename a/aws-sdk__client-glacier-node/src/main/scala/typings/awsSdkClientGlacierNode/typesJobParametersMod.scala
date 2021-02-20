package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobInputMod.InventoryRetrievalJobInput
import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobInputMod.UnmarshalledInventoryRetrievalJobInput
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesJobParametersMod {
  
  @js.native
  trait JobParameters extends StObject {
    
    /**
      * <p>The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set to <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this request parameter for an inventory retrieval job request. </p>
      */
    var ArchiveId: js.UndefOr[String] = js.native
    
    /**
      * <p>The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E hexadecimal.</p>
      */
    var Description: js.UndefOr[String] = js.native
    
    /**
      * <p>When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the default format. Valid values are "CSV" and "JSON".</p>
      */
    var Format: js.UndefOr[String] = js.native
    
    /**
      * <p>Input parameters used for range inventory retrieval.</p>
      */
    var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.native
    
    /**
      * <p>Contains information about the location where the select job results are stored.</p>
      */
    var OutputLocation: js.UndefOr[typings.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation] = js.native
    
    /**
      * <p>The byte range to retrieve for an archive retrieval. in the form "<i>StartByteValue</i>-<i>EndByteValue</i>" If not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned which means that <i>StartByteValue</i> must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this operation returns a 400 response. </p> <p>An error occurs if you specify this field for an inventory retrieval job request.</p>
      */
    var RetrievalByteRange: js.UndefOr[String] = js.native
    
    /**
      * <p>The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must exist.</p>
      */
    var SNSTopic: js.UndefOr[String] = js.native
    
    /**
      * <p>Contains the parameters that define a job.</p>
      */
    var SelectParameters: js.UndefOr[typings.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters] = js.native
    
    /**
      * <p>The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>, <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.</p>
      */
    var Tier: js.UndefOr[String] = js.native
    
    /**
      * <p>The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".</p>
      */
    var Type: js.UndefOr[String] = js.native
  }
  object JobParameters {
    
    @scala.inline
    def apply(): JobParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobParameters]
    }
    
    @scala.inline
    implicit class JobParametersMutableBuilder[Self <: JobParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchiveId(value: String): Self = StObject.set(x, "ArchiveId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveIdUndefined: Self = StObject.set(x, "ArchiveId", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
      
      @scala.inline
      def setInventoryRetrievalParameters(value: InventoryRetrievalJobInput): Self = StObject.set(x, "InventoryRetrievalParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInventoryRetrievalParametersUndefined: Self = StObject.set(x, "InventoryRetrievalParameters", js.undefined)
      
      @scala.inline
      def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
      
      @scala.inline
      def setRetrievalByteRange(value: String): Self = StObject.set(x, "RetrievalByteRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetrievalByteRangeUndefined: Self = StObject.set(x, "RetrievalByteRange", js.undefined)
      
      @scala.inline
      def setSNSTopic(value: String): Self = StObject.set(x, "SNSTopic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSNSTopicUndefined: Self = StObject.set(x, "SNSTopic", js.undefined)
      
      @scala.inline
      def setSelectParameters(value: SelectParameters): Self = StObject.set(x, "SelectParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectParametersUndefined: Self = StObject.set(x, "SelectParameters", js.undefined)
      
      @scala.inline
      def setTier(value: String): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledJobParameters extends JobParameters {
    
    /**
      * <p>Input parameters used for range inventory retrieval.</p>
      */
    @JSName("InventoryRetrievalParameters")
    var InventoryRetrievalParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledInventoryRetrievalJobInput] = js.native
    
    /**
      * <p>Contains information about the location where the select job results are stored.</p>
      */
    @JSName("OutputLocation")
    var OutputLocation_UnmarshalledJobParameters: js.UndefOr[UnmarshalledOutputLocation] = js.native
    
    /**
      * <p>Contains the parameters that define a job.</p>
      */
    @JSName("SelectParameters")
    var SelectParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledSelectParameters] = js.native
  }
  object UnmarshalledJobParameters {
    
    @scala.inline
    def apply(): UnmarshalledJobParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledJobParameters]
    }
    
    @scala.inline
    implicit class UnmarshalledJobParametersMutableBuilder[Self <: UnmarshalledJobParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInventoryRetrievalParameters(value: UnmarshalledInventoryRetrievalJobInput): Self = StObject.set(x, "InventoryRetrievalParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInventoryRetrievalParametersUndefined: Self = StObject.set(x, "InventoryRetrievalParameters", js.undefined)
      
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
