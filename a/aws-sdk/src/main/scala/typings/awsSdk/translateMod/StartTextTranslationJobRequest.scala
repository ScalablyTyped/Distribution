package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextTranslationJobRequest extends js.Object {
  /**
    * The client token of the EC2 instance calling the request. This token is auto-generated when using the Amazon Translate SDK. Otherwise, use the DescribeInstances EC2 operation to retreive an instance's client token. For more information, see Client Tokens in the EC2 User Guide.
    */
  var ClientToken: ClientTokenString = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon Translate read access to your input data. For more nformation, see identity-and-access-management.
    */
  var DataAccessRoleArn: IamRoleArn = js.native
  /**
    * Specifies the format and S3 location of the input documents for the translation job.
    */
  var InputDataConfig: typings.awsSdk.translateMod.InputDataConfig = js.native
  /**
    * The name of the batch translation job to be performed.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.native
  /**
    * Specifies the S3 folder to which your job output will be saved. 
    */
  var OutputDataConfig: typings.awsSdk.translateMod.OutputDataConfig = js.native
  /**
    * The language code of the input language. For a list of language codes, see what-is-languages. Amazon Translate does not automatically detect a source language during batch translation jobs.
    */
  var SourceLanguageCode: LanguageCodeString = js.native
  /**
    * The language code of the output language.
    */
  var TargetLanguageCodes: TargetLanguageCodeStringList = js.native
  /**
    * The name of the terminology to use in the batch translation job. For a list of available terminologies, use the ListTerminologies operation.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.native
}

object StartTextTranslationJobRequest {
  @scala.inline
  def apply(
    ClientToken: ClientTokenString,
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig,
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCodes: TargetLanguageCodeStringList,
    JobName: JobName = null,
    TerminologyNames: ResourceNameList = null
  ): StartTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCodes = TargetLanguageCodes.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (TerminologyNames != null) __obj.updateDynamic("TerminologyNames")(TerminologyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTextTranslationJobRequest]
  }
}

