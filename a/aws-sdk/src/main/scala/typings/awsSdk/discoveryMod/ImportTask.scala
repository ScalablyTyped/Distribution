package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportTask extends js.Object {
  
  /**
    * The total number of application records in the import file that failed to be imported.
    */
  var applicationImportFailure: js.UndefOr[Integer] = js.native
  
  /**
    * The total number of application records in the import file that were successfully imported.
    */
  var applicationImportSuccess: js.UndefOr[Integer] = js.native
  
  /**
    * A unique token used to prevent the same import request from occurring more than once. If you didn't provide a token, a token was automatically generated when the import task request was sent.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * A link to a compressed archive folder (in the ZIP format) that contains an error log and a file of failed records. You can use these two files to quickly identify records that failed, why they failed, and correct those records. Afterward, you can upload the corrected file to your Amazon S3 bucket and create another import task request. This field also includes authorization information so you can confirm the authenticity of the compressed archive before you download it. If some records failed to be imported we recommend that you correct the records in the failed entries file and then imports that failed entries file. This prevents you from having to correct and update the larger original file and attempt importing it again.
    */
  var errorsAndFailedEntriesZip: js.UndefOr[S3PresignedUrl] = js.native
  
  /**
    * The time that the import task request finished, presented in the Unix time stamp format.
    */
  var importCompletionTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The time that the import task request was deleted, presented in the Unix time stamp format.
    */
  var importDeletedTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The time that the import task request was made, presented in the Unix time stamp format.
    */
  var importRequestTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The unique ID for a specific import task. These IDs aren't globally unique, but they are unique within an AWS account.
    */
  var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.native
  
  /**
    * The URL for your import file that you've uploaded to Amazon S3.
    */
  var importUrl: js.UndefOr[ImportURL] = js.native
  
  /**
    * A descriptive name for an import task. You can use this name to filter future requests related to this import task, such as identifying applications and servers that were included in this import task. We recommend that you use a meaningful name for each import task.
    */
  var name: js.UndefOr[ImportTaskName] = js.native
  
  /**
    * The total number of server records in the import file that failed to be imported.
    */
  var serverImportFailure: js.UndefOr[Integer] = js.native
  
  /**
    * The total number of server records in the import file that were successfully imported.
    */
  var serverImportSuccess: js.UndefOr[Integer] = js.native
  
  /**
    * The status of the import task. An import can have the status of IMPORT_COMPLETE and still have some records fail to import from the overall request. More information can be found in the downloadable archive defined in the errorsAndFailedEntriesZip field, or in the Migration Hub management console.
    */
  var status: js.UndefOr[ImportStatus] = js.native
}
object ImportTask {
  
  @scala.inline
  def apply(): ImportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTask]
  }
  
  @scala.inline
  implicit class ImportTaskOps[Self <: ImportTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationImportFailure(value: Integer): Self = this.set("applicationImportFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationImportFailure: Self = this.set("applicationImportFailure", js.undefined)
    
    @scala.inline
    def setApplicationImportSuccess(value: Integer): Self = this.set("applicationImportSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationImportSuccess: Self = this.set("applicationImportSuccess", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setErrorsAndFailedEntriesZip(value: S3PresignedUrl): Self = this.set("errorsAndFailedEntriesZip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorsAndFailedEntriesZip: Self = this.set("errorsAndFailedEntriesZip", js.undefined)
    
    @scala.inline
    def setImportCompletionTime(value: TimeStamp): Self = this.set("importCompletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportCompletionTime: Self = this.set("importCompletionTime", js.undefined)
    
    @scala.inline
    def setImportDeletedTime(value: TimeStamp): Self = this.set("importDeletedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportDeletedTime: Self = this.set("importDeletedTime", js.undefined)
    
    @scala.inline
    def setImportRequestTime(value: TimeStamp): Self = this.set("importRequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportRequestTime: Self = this.set("importRequestTime", js.undefined)
    
    @scala.inline
    def setImportTaskId(value: ImportTaskIdentifier): Self = this.set("importTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportTaskId: Self = this.set("importTaskId", js.undefined)
    
    @scala.inline
    def setImportUrl(value: ImportURL): Self = this.set("importUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportUrl: Self = this.set("importUrl", js.undefined)
    
    @scala.inline
    def setName(value: ImportTaskName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServerImportFailure(value: Integer): Self = this.set("serverImportFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerImportFailure: Self = this.set("serverImportFailure", js.undefined)
    
    @scala.inline
    def setServerImportSuccess(value: Integer): Self = this.set("serverImportSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerImportSuccess: Self = this.set("serverImportSuccess", js.undefined)
    
    @scala.inline
    def setStatus(value: ImportStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
