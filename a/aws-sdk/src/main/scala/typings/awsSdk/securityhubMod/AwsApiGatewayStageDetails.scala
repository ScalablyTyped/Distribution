package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayStageDetails extends js.Object {
  
  /**
    * Settings for logging access for the stage.
    */
  var AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings] = js.native
  
  /**
    * Indicates whether a cache cluster is enabled for the stage.
    */
  var CacheClusterEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If a cache cluster is enabled, the size of the cache cluster.
    */
  var CacheClusterSize: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * If a cache cluster is enabled, the status of the cache cluster.
    */
  var CacheClusterStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about settings for canary deployment in the stage.
    */
  var CanarySettings: js.UndefOr[AwsApiGatewayCanarySettings] = js.native
  
  /**
    * The identifier of the client certificate for the stage.
    */
  var ClientCertificateId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the stage was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the deployment that the stage points to.
    */
  var DeploymentId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A description of the stage.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version of the API documentation that is associated with the stage.
    */
  var DocumentationVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the stage was most recently updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastUpdatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Defines the method settings for the stage.
    */
  var MethodSettings: js.UndefOr[AwsApiGatewayMethodSettingsList] = js.native
  
  /**
    * The name of the stage.
    */
  var StageName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether active tracing with AWS X-Ray is enabled for the stage.
    */
  var TracingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A map that defines the stage variables for the stage. Variable names can have alphanumeric and underscore characters. Variable values can contain the following characters:   Uppercase and lowercase letters   Numbers   Special characters -._~:/?#&amp;=,  
    */
  var Variables: js.UndefOr[FieldMap] = js.native
  
  /**
    * The ARN of the web ACL associated with the stage.
    */
  var WebAclArn: js.UndefOr[NonEmptyString] = js.native
}
object AwsApiGatewayStageDetails {
  
  @scala.inline
  def apply(): AwsApiGatewayStageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayStageDetails]
  }
  
  @scala.inline
  implicit class AwsApiGatewayStageDetailsOps[Self <: AwsApiGatewayStageDetails] (val x: Self) extends AnyVal {
    
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
    def setAccessLogSettings(value: AwsApiGatewayAccessLogSettings): Self = this.set("AccessLogSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLogSettings: Self = this.set("AccessLogSettings", js.undefined)
    
    @scala.inline
    def setCacheClusterEnabled(value: Boolean): Self = this.set("CacheClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterEnabled: Self = this.set("CacheClusterEnabled", js.undefined)
    
    @scala.inline
    def setCacheClusterSize(value: NonEmptyString): Self = this.set("CacheClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterSize: Self = this.set("CacheClusterSize", js.undefined)
    
    @scala.inline
    def setCacheClusterStatus(value: NonEmptyString): Self = this.set("CacheClusterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterStatus: Self = this.set("CacheClusterStatus", js.undefined)
    
    @scala.inline
    def setCanarySettings(value: AwsApiGatewayCanarySettings): Self = this.set("CanarySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanarySettings: Self = this.set("CanarySettings", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: NonEmptyString): Self = this.set("ClientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateId: Self = this.set("ClientCertificateId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: NonEmptyString): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDocumentationVersion(value: NonEmptyString): Self = this.set("DocumentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentationVersion: Self = this.set("DocumentationVersion", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: NonEmptyString): Self = this.set("LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMethodSettingsVarargs(value: AwsApiGatewayMethodSettings*): Self = this.set("MethodSettings", js.Array(value :_*))
    
    @scala.inline
    def setMethodSettings(value: AwsApiGatewayMethodSettingsList): Self = this.set("MethodSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodSettings: Self = this.set("MethodSettings", js.undefined)
    
    @scala.inline
    def setStageName(value: NonEmptyString): Self = this.set("StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("StageName", js.undefined)
    
    @scala.inline
    def setTracingEnabled(value: Boolean): Self = this.set("TracingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracingEnabled: Self = this.set("TracingEnabled", js.undefined)
    
    @scala.inline
    def setVariables(value: FieldMap): Self = this.set("Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
    
    @scala.inline
    def setWebAclArn(value: NonEmptyString): Self = this.set("WebAclArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAclArn: Self = this.set("WebAclArn", js.undefined)
  }
}
