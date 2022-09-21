package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiGatewayStageDetails extends StObject {
  
  /**
    * Settings for logging access for the stage.
    */
  var AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings] = js.undefined
  
  /**
    * Indicates whether a cache cluster is enabled for the stage.
    */
  var CacheClusterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a cache cluster is enabled, the size of the cache cluster.
    */
  var CacheClusterSize: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * If a cache cluster is enabled, the status of the cache cluster.
    */
  var CacheClusterStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about settings for canary deployment in the stage.
    */
  var CanarySettings: js.UndefOr[AwsApiGatewayCanarySettings] = js.undefined
  
  /**
    * The identifier of the client certificate for the stage.
    */
  var ClientCertificateId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the stage was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the deployment that the stage points to.
    */
  var DeploymentId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A description of the stage.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the API documentation that is associated with the stage.
    */
  var DocumentationVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the stage was most recently updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastUpdatedDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Defines the method settings for the stage.
    */
  var MethodSettings: js.UndefOr[AwsApiGatewayMethodSettingsList] = js.undefined
  
  /**
    * The name of the stage.
    */
  var StageName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether active tracing with X-Ray is enabled for the stage.
    */
  var TracingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map that defines the stage variables for the stage. Variable names can have alphanumeric and underscore characters. Variable values can contain the following characters:   Uppercase and lowercase letters   Numbers   Special characters -._~:/?#&amp;=,  
    */
  var Variables: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The ARN of the web ACL associated with the stage.
    */
  var WebAclArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsApiGatewayStageDetails {
  
  inline def apply(): AwsApiGatewayStageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayStageDetails]
  }
  
  extension [Self <: AwsApiGatewayStageDetails](x: Self) {
    
    inline def setAccessLogSettings(value: AwsApiGatewayAccessLogSettings): Self = StObject.set(x, "AccessLogSettings", value.asInstanceOf[js.Any])
    
    inline def setAccessLogSettingsUndefined: Self = StObject.set(x, "AccessLogSettings", js.undefined)
    
    inline def setCacheClusterEnabled(value: Boolean): Self = StObject.set(x, "CacheClusterEnabled", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterEnabledUndefined: Self = StObject.set(x, "CacheClusterEnabled", js.undefined)
    
    inline def setCacheClusterSize(value: NonEmptyString): Self = StObject.set(x, "CacheClusterSize", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterSizeUndefined: Self = StObject.set(x, "CacheClusterSize", js.undefined)
    
    inline def setCacheClusterStatus(value: NonEmptyString): Self = StObject.set(x, "CacheClusterStatus", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterStatusUndefined: Self = StObject.set(x, "CacheClusterStatus", js.undefined)
    
    inline def setCanarySettings(value: AwsApiGatewayCanarySettings): Self = StObject.set(x, "CanarySettings", value.asInstanceOf[js.Any])
    
    inline def setCanarySettingsUndefined: Self = StObject.set(x, "CanarySettings", js.undefined)
    
    inline def setClientCertificateId(value: NonEmptyString): Self = StObject.set(x, "ClientCertificateId", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateIdUndefined: Self = StObject.set(x, "ClientCertificateId", js.undefined)
    
    inline def setCreatedDate(value: NonEmptyString): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDocumentationVersion(value: NonEmptyString): Self = StObject.set(x, "DocumentationVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentationVersionUndefined: Self = StObject.set(x, "DocumentationVersion", js.undefined)
    
    inline def setLastUpdatedDate(value: NonEmptyString): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setMethodSettings(value: AwsApiGatewayMethodSettingsList): Self = StObject.set(x, "MethodSettings", value.asInstanceOf[js.Any])
    
    inline def setMethodSettingsUndefined: Self = StObject.set(x, "MethodSettings", js.undefined)
    
    inline def setMethodSettingsVarargs(value: AwsApiGatewayMethodSettings*): Self = StObject.set(x, "MethodSettings", js.Array(value*))
    
    inline def setStageName(value: NonEmptyString): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
    
    inline def setTracingEnabled(value: Boolean): Self = StObject.set(x, "TracingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTracingEnabledUndefined: Self = StObject.set(x, "TracingEnabled", js.undefined)
    
    inline def setVariables(value: FieldMap): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    
    inline def setWebAclArn(value: NonEmptyString): Self = StObject.set(x, "WebAclArn", value.asInstanceOf[js.Any])
    
    inline def setWebAclArnUndefined: Self = StObject.set(x, "WebAclArn", js.undefined)
  }
}
