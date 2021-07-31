package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDetail extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN
  
  /**
    * Provides details about the application's Java, SQL, or Scala code and starting parameters.
    */
  var ApplicationConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationConfigurationDescription] = js.undefined
  
  /**
    * The description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationDescription] = js.undefined
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationStatus
  
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId
  
  /**
    * Describes the application Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.undefined
  
  /**
    * The current timestamp when the application was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The current timestamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The runtime environment for the application (SQL-1.0, FLINK-1_6, or FLINK-1_8).
    */
  var RuntimeEnvironment: typings.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment
  
  /**
    * Specifies the IAM role that the application uses to access external resources.
    */
  var ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined
}
object ApplicationDetail {
  
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
  
  @scala.inline
  implicit class ApplicationDetailMutableBuilder[Self <: ApplicationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationConfigurationDescription(value: ApplicationConfigurationDescription): Self = StObject.set(x, "ApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationConfigurationDescription", js.undefined)
    
    @scala.inline
    def setApplicationDescription(value: ApplicationDescription): Self = StObject.set(x, "ApplicationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationDescriptionUndefined: Self = StObject.set(x, "ApplicationDescription", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdateTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setRuntimeEnvironment(value: RuntimeEnvironment): Self = StObject.set(x, "RuntimeEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceExecutionRole(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceExecutionRoleUndefined: Self = StObject.set(x, "ServiceExecutionRole", js.undefined)
  }
}
