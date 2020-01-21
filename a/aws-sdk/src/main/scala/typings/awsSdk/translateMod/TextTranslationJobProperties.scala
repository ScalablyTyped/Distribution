package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTranslationJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate read access to the job's input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The time at which the translation job ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The input configuration properties that were specified when the job was requested.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.translateMod.InputDataConfig] = js.native
  /**
    * The number of documents successfully and unsuccessfully processed during the translation job.
    */
  var JobDetails: js.UndefOr[typings.awsSdk.translateMod.JobDetails] = js.native
  /**
    * The ID of the translation job.
    */
  var JobId: js.UndefOr[typings.awsSdk.translateMod.JobId] = js.native
  /**
    * The user-defined name of the translation job.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.native
  /**
    * The status of the translation job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.native
  /**
    * An explanation of any errors that may have occured during the translation job.
    */
  var Message: js.UndefOr[UnboundedLengthString] = js.native
  /**
    * The output configuration properties that were specified when the job was requested.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.translateMod.OutputDataConfig] = js.native
  /**
    * The language code of the language of the source text. The language must be a language supported by Amazon Translate.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.native
  /**
    * The time at which the translation job was submitted.
    */
  var SubmittedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The language code of the language of the target text. The language must be a language supported by Amazon Translate.
    */
  var TargetLanguageCodes: js.UndefOr[TargetLanguageCodeStringList] = js.native
  /**
    * A list containing the names of the terminologies applied to a translation job. Only one terminology can be applied per StartTextTranslationJob request at this time.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.native
}

object TextTranslationJobProperties {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn = null,
    EndTime: Timestamp = null,
    InputDataConfig: InputDataConfig = null,
    JobDetails: JobDetails = null,
    JobId: JobId = null,
    JobName: JobName = null,
    JobStatus: JobStatus = null,
    Message: UnboundedLengthString = null,
    OutputDataConfig: OutputDataConfig = null,
    SourceLanguageCode: LanguageCodeString = null,
    SubmittedTime: Timestamp = null,
    TargetLanguageCodes: TargetLanguageCodeStringList = null,
    TerminologyNames: ResourceNameList = null
  ): TextTranslationJobProperties = {
    val __obj = js.Dynamic.literal()
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig.asInstanceOf[js.Any])
    if (JobDetails != null) __obj.updateDynamic("JobDetails")(JobDetails.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig.asInstanceOf[js.Any])
    if (SourceLanguageCode != null) __obj.updateDynamic("SourceLanguageCode")(SourceLanguageCode.asInstanceOf[js.Any])
    if (SubmittedTime != null) __obj.updateDynamic("SubmittedTime")(SubmittedTime.asInstanceOf[js.Any])
    if (TargetLanguageCodes != null) __obj.updateDynamic("TargetLanguageCodes")(TargetLanguageCodes.asInstanceOf[js.Any])
    if (TerminologyNames != null) __obj.updateDynamic("TerminologyNames")(TerminologyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTranslationJobProperties]
  }
}

