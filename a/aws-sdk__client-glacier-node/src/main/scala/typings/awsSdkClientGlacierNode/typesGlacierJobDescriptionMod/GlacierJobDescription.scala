package typings.awsSdkClientGlacierNode.typesGlacierJobDescriptionMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ArchiveRetrieval
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Failed
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InProgress
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InventoryRetrieval
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Select
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Succeeded
import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobDescriptionMod.InventoryRetrievalJobDescription
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlacierJobDescription extends js.Object {
  
  /**
    * <p>The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or <code>Select</code>. </p>
    */
  var Action: js.UndefOr[ArchiveRetrieval | InventoryRetrieval | Select | String] = js.native
  
  /**
    * <p>The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.</p>
    */
  var ArchiveId: js.UndefOr[String] = js.native
  
  /**
    * <p>The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this field is null.</p>
    */
  var ArchiveSHA256TreeHash: js.UndefOr[String] = js.native
  
  /**
    * <p>For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an inventory retrieval or select job, this value is null.</p>
    */
  var ArchiveSizeInBytes: js.UndefOr[Double] = js.native
  
  /**
    * <p>The job status. When a job is completed, you get the job's output using Get Job Output (GET output).</p>
    */
  var Completed: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The UTC time that the job request completed. While the job is in progress, the value is null.</p>
    */
  var CompletionDate: js.UndefOr[String] = js.native
  
  /**
    * <p>The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example <code>"2012-03-20T17:03:43.221Z"</code>.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  
  /**
    * <p>Parameters used for range inventory retrieval.</p>
    */
  var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription] = js.native
  
  /**
    * <p>For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an archive retrieval or select job, this value is null.</p>
    */
  var InventorySizeInBytes: js.UndefOr[Double] = js.native
  
  /**
    * <p>The job description provided when initiating the job.</p>
    */
  var JobDescription: js.UndefOr[String] = js.native
  
  /**
    * <p>An opaque string that identifies an Amazon Glacier job.</p>
    */
  var JobId: js.UndefOr[String] = js.native
  
  /**
    * <p>Contains the job output location.</p>
    */
  var JobOutputPath: js.UndefOr[String] = js.native
  
  /**
    * <p>Contains the location where the data from the select job is stored.</p>
    */
  var OutputLocation: js.UndefOr[typings.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation] = js.native
  
  /**
    * <p>The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case, <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory retrieval or select jobs, this field is null. </p>
    */
  var RetrievalByteRange: js.UndefOr[String] = js.native
  
  /**
    * <p>For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.</p> <p>The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an archive specified a tree-hash aligned range, then this field returns a value.</p> <p>If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.</p> <p>This field is null for the following:</p> <ul> <li> <p>Archive retrieval jobs that specify a range that is not tree-hash aligned</p> </li> </ul> <ul> <li> <p>Archival jobs that specify a range that is equal to the whole archive, when the job status is <code>InProgress</code> </p> </li> </ul> <ul> <li> <p>Inventory jobs</p> </li> <li> <p>Select jobs</p> </li> </ul>
    */
  var SHA256TreeHash: js.UndefOr[String] = js.native
  
  /**
    * <p>An Amazon SNS topic that receives notification.</p>
    */
  var SNSTopic: js.UndefOr[String] = js.native
  
  /**
    * <p>Contains the parameters used for a select.</p>
    */
  var SelectParameters: js.UndefOr[typings.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters] = js.native
  
  /**
    * <p>The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the status of the job.</p>
    */
  var StatusCode: js.UndefOr[InProgress | Succeeded | Failed | String] = js.native
  
  /**
    * <p>A friendly message that describes the job status.</p>
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * <p>The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>, <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.</p>
    */
  var Tier: js.UndefOr[String] = js.native
  
  /**
    * <p>The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.</p>
    */
  var VaultARN: js.UndefOr[String] = js.native
}
object GlacierJobDescription {
  
  @scala.inline
  def apply(): GlacierJobDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlacierJobDescription]
  }
  
  @scala.inline
  implicit class GlacierJobDescriptionOps[Self <: GlacierJobDescription] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ArchiveRetrieval | InventoryRetrieval | Select | String): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setArchiveId(value: String): Self = this.set("ArchiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveId: Self = this.set("ArchiveId", js.undefined)
    
    @scala.inline
    def setArchiveSHA256TreeHash(value: String): Self = this.set("ArchiveSHA256TreeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveSHA256TreeHash: Self = this.set("ArchiveSHA256TreeHash", js.undefined)
    
    @scala.inline
    def setArchiveSizeInBytes(value: Double): Self = this.set("ArchiveSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveSizeInBytes: Self = this.set("ArchiveSizeInBytes", js.undefined)
    
    @scala.inline
    def setCompleted(value: Boolean): Self = this.set("Completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("Completed", js.undefined)
    
    @scala.inline
    def setCompletionDate(value: String): Self = this.set("CompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionDate: Self = this.set("CompletionDate", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setInventoryRetrievalParameters(value: InventoryRetrievalJobDescription): Self = this.set("InventoryRetrievalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryRetrievalParameters: Self = this.set("InventoryRetrievalParameters", js.undefined)
    
    @scala.inline
    def setInventorySizeInBytes(value: Double): Self = this.set("InventorySizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySizeInBytes: Self = this.set("InventorySizeInBytes", js.undefined)
    
    @scala.inline
    def setJobDescription(value: String): Self = this.set("JobDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobDescription: Self = this.set("JobDescription", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setJobOutputPath(value: String): Self = this.set("JobOutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobOutputPath: Self = this.set("JobOutputPath", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    
    @scala.inline
    def setRetrievalByteRange(value: String): Self = this.set("RetrievalByteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrievalByteRange: Self = this.set("RetrievalByteRange", js.undefined)
    
    @scala.inline
    def setSHA256TreeHash(value: String): Self = this.set("SHA256TreeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSHA256TreeHash: Self = this.set("SHA256TreeHash", js.undefined)
    
    @scala.inline
    def setSNSTopic(value: String): Self = this.set("SNSTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSNSTopic: Self = this.set("SNSTopic", js.undefined)
    
    @scala.inline
    def setSelectParameters(value: SelectParameters): Self = this.set("SelectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectParameters: Self = this.set("SelectParameters", js.undefined)
    
    @scala.inline
    def setStatusCode(value: InProgress | Succeeded | Failed | String): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("StatusCode", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    
    @scala.inline
    def setVaultARN(value: String): Self = this.set("VaultARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultARN: Self = this.set("VaultARN", js.undefined)
  }
}
