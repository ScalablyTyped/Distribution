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
  def apply(): TextTranslationJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobProperties]
  }
  @scala.inline
  implicit class TextTranslationJobPropertiesOps[Self <: TextTranslationJobProperties] (val x: Self) extends AnyVal {
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
    def setDataAccessRoleArn(value: IamRoleArn): Self = this.set("DataAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAccessRoleArn: Self = this.set("DataAccessRoleArn", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDataConfig: Self = this.set("InputDataConfig", js.undefined)
    @scala.inline
    def setJobDetails(value: JobDetails): Self = this.set("JobDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobDetails: Self = this.set("JobDetails", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setJobName(value: JobName): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    @scala.inline
    def setMessage(value: UnboundedLengthString): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = this.set("OutputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputDataConfig: Self = this.set("OutputDataConfig", js.undefined)
    @scala.inline
    def setSourceLanguageCode(value: LanguageCodeString): Self = this.set("SourceLanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLanguageCode: Self = this.set("SourceLanguageCode", js.undefined)
    @scala.inline
    def setSubmittedTime(value: Timestamp): Self = this.set("SubmittedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedTime: Self = this.set("SubmittedTime", js.undefined)
    @scala.inline
    def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = this.set("TargetLanguageCodes", js.Array(value :_*))
    @scala.inline
    def setTargetLanguageCodes(value: TargetLanguageCodeStringList): Self = this.set("TargetLanguageCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetLanguageCodes: Self = this.set("TargetLanguageCodes", js.undefined)
    @scala.inline
    def setTerminologyNamesVarargs(value: ResourceName*): Self = this.set("TerminologyNames", js.Array(value :_*))
    @scala.inline
    def setTerminologyNames(value: ResourceNameList): Self = this.set("TerminologyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminologyNames: Self = this.set("TerminologyNames", js.undefined)
  }
  
}

