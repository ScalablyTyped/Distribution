package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDetail extends js.Object {
  
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  
  /**
    * Returns the application code that you provided to perform data analysis on any of the in-application streams in your application.
    */
  var ApplicationCode: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ApplicationCode] = js.native
  
  /**
    * Description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ApplicationDescription] = js.native
  
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  
  /**
    * Status of the application.
    */
  var ApplicationStatus: typings.awsSdk.kinesisanalyticsMod.ApplicationStatus = js.native
  
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsMod.ApplicationVersionId = js.native
  
  /**
    * Describes the CloudWatch log streams that are configured to receive application messages. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs. 
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionDescriptions] = js.native
  
  /**
    * Time stamp when the application version was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * Describes the application input configuration. For more information, see Configuring Application Input. 
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputDescriptions] = js.native
  
  /**
    * Time stamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.OutputDescriptions] = js.native
  
  /**
    * Describes reference data sources configured for the application. For more information, see Configuring Application Input. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ReferenceDataSourceDescriptions] = js.native
}
object ApplicationDetail {
  
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
  
  @scala.inline
  implicit class ApplicationDetailOps[Self <: ApplicationDetail] (val x: Self) extends AnyVal {
    
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
    def setApplicationARN(value: ResourceARN): Self = this.set("ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationStatus(value: ApplicationStatus): Self = this.set("ApplicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = this.set("ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCode(value: ApplicationCode): Self = this.set("ApplicationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationCode: Self = this.set("ApplicationCode", js.undefined)
    
    @scala.inline
    def setApplicationDescription(value: ApplicationDescription): Self = this.set("ApplicationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationDescription: Self = this.set("ApplicationDescription", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = this.set("CloudWatchLoggingOptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = this.set("CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLoggingOptionDescriptions: Self = this.set("CloudWatchLoggingOptionDescriptions", js.undefined)
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = this.set("CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("CreateTimestamp", js.undefined)
    
    @scala.inline
    def setInputDescriptionsVarargs(value: InputDescription*): Self = this.set("InputDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setInputDescriptions(value: InputDescriptions): Self = this.set("InputDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDescriptions: Self = this.set("InputDescriptions", js.undefined)
    
    @scala.inline
    def setLastUpdateTimestamp(value: Timestamp): Self = this.set("LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTimestamp: Self = this.set("LastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setOutputDescriptionsVarargs(value: OutputDescription*): Self = this.set("OutputDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setOutputDescriptions(value: OutputDescriptions): Self = this.set("OutputDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDescriptions: Self = this.set("OutputDescriptions", js.undefined)
    
    @scala.inline
    def setReferenceDataSourceDescriptionsVarargs(value: ReferenceDataSourceDescription*): Self = this.set("ReferenceDataSourceDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = this.set("ReferenceDataSourceDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceDataSourceDescriptions: Self = this.set("ReferenceDataSourceDescriptions", js.undefined)
  }
}
