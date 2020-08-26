package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobParameters extends js.Object {
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
  implicit class JobParametersOps[Self <: JobParameters] (val x: Self) extends AnyVal {
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
    def setArchiveId(value: String): Self = this.set("ArchiveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveId: Self = this.set("ArchiveId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setInventoryRetrievalParameters(value: InventoryRetrievalJobInput): Self = this.set("InventoryRetrievalParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryRetrievalParameters: Self = this.set("InventoryRetrievalParameters", js.undefined)
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    @scala.inline
    def setRetrievalByteRange(value: String): Self = this.set("RetrievalByteRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrievalByteRange: Self = this.set("RetrievalByteRange", js.undefined)
    @scala.inline
    def setSNSTopic(value: String): Self = this.set("SNSTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSNSTopic: Self = this.set("SNSTopic", js.undefined)
    @scala.inline
    def setSelectParameters(value: SelectParameters): Self = this.set("SelectParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectParameters: Self = this.set("SelectParameters", js.undefined)
    @scala.inline
    def setTier(value: String): Self = this.set("Tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

