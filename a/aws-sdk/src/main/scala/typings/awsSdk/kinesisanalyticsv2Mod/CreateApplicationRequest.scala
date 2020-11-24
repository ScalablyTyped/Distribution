package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationRequest extends js.Object {
  
  /**
    * Use this parameter to configure the application.
    */
  var ApplicationConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationConfiguration] = js.native
  
  /**
    * A summary description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationDescription] = js.native
  
  /**
    * The name of your application (for example, sample-app).
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors. 
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The runtime environment for the application (SQL-1.0, FLINK-1_6, or FLINK-1_8).
    */
  var RuntimeEnvironment: typings.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment = js.native
  
  /**
    * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  var ServiceExecutionRole: RoleARN = js.native
  
  /**
    * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Tagging.
    */
  var Tags: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Tags] = js.native
}
object CreateApplicationRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    RuntimeEnvironment: RuntimeEnvironment,
    ServiceExecutionRole: RoleARN
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any], ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit class CreateApplicationRequestOps[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeEnvironment(value: RuntimeEnvironment): Self = this.set("RuntimeEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceExecutionRole(value: RoleARN): Self = this.set("ServiceExecutionRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationConfiguration(value: ApplicationConfiguration): Self = this.set("ApplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationConfiguration: Self = this.set("ApplicationConfiguration", js.undefined)
    
    @scala.inline
    def setApplicationDescription(value: ApplicationDescription): Self = this.set("ApplicationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationDescription: Self = this.set("ApplicationDescription", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionsVarargs(value: CloudWatchLoggingOption*): Self = this.set("CloudWatchLoggingOptions", js.Array(value :_*))
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = this.set("CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLoggingOptions: Self = this.set("CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
