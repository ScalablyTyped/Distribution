package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    applicationImportFailure: js.UndefOr[Integer] = js.undefined,
    applicationImportSuccess: js.UndefOr[Integer] = js.undefined,
    clientRequestToken: ClientRequestToken = null,
    errorsAndFailedEntriesZip: S3PresignedUrl = null,
    importCompletionTime: TimeStamp = null,
    importDeletedTime: TimeStamp = null,
    importRequestTime: TimeStamp = null,
    importTaskId: ImportTaskIdentifier = null,
    importUrl: ImportURL = null,
    name: ImportTaskName = null,
    serverImportFailure: js.UndefOr[Integer] = js.undefined,
    serverImportSuccess: js.UndefOr[Integer] = js.undefined,
    status: ImportStatus = null
  ): ImportTask = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationImportFailure)) __obj.updateDynamic("applicationImportFailure")(applicationImportFailure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationImportSuccess)) __obj.updateDynamic("applicationImportSuccess")(applicationImportSuccess.get.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (errorsAndFailedEntriesZip != null) __obj.updateDynamic("errorsAndFailedEntriesZip")(errorsAndFailedEntriesZip.asInstanceOf[js.Any])
    if (importCompletionTime != null) __obj.updateDynamic("importCompletionTime")(importCompletionTime.asInstanceOf[js.Any])
    if (importDeletedTime != null) __obj.updateDynamic("importDeletedTime")(importDeletedTime.asInstanceOf[js.Any])
    if (importRequestTime != null) __obj.updateDynamic("importRequestTime")(importRequestTime.asInstanceOf[js.Any])
    if (importTaskId != null) __obj.updateDynamic("importTaskId")(importTaskId.asInstanceOf[js.Any])
    if (importUrl != null) __obj.updateDynamic("importUrl")(importUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(serverImportFailure)) __obj.updateDynamic("serverImportFailure")(serverImportFailure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverImportSuccess)) __obj.updateDynamic("serverImportSuccess")(serverImportSuccess.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTask]
  }
}

