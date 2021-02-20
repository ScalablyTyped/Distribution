package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobParameters extends StObject {
  
  /**
    * The ID of the archive that you want to retrieve. This field is required only if Type is set to select or archive-retrievalcode&gt;. An error occurs if you specify this request parameter for an inventory retrieval job request. 
    */
  var ArchiveId: js.UndefOr[String] = js.native
  
  /**
    * The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E hexadecimal.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the default format. Valid values are "CSV" and "JSON".
    */
  var Format: js.UndefOr[String] = js.native
  
  /**
    * Input parameters used for range inventory retrieval.
    */
  var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.native
  
  /**
    * Contains information about the location where the select job results are stored.
    */
  var OutputLocation: js.UndefOr[typings.awsSdk.glacierMod.OutputLocation] = js.native
  
  /**
    * The byte range to retrieve for an archive retrieval. in the form "StartByteValue-EndByteValue" If not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned which means that StartByteValue must be divisible by 1 MB and EndByteValue plus 1 must be divisible by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this operation returns a 400 response.  An error occurs if you specify this field for an inventory retrieval job request.
    */
  var RetrievalByteRange: js.UndefOr[String] = js.native
  
  /**
    * The Amazon SNS topic ARN to which Amazon S3 Glacier sends a notification when the job is completed and the output is ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must exist.
    */
  var SNSTopic: js.UndefOr[String] = js.native
  
  /**
    * Contains the parameters that define a job.
    */
  var SelectParameters: js.UndefOr[typings.awsSdk.glacierMod.SelectParameters] = js.native
  
  /**
    * The tier to use for a select or an archive retrieval job. Valid values are Expedited, Standard, or Bulk. Standard is the default.
    */
  var Tier: js.UndefOr[String] = js.native
  
  /**
    * The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
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
