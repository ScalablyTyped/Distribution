package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayV2StageDetails extends StObject {
  
  /**
    * Information about settings for logging access for the stage.
    */
  var AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings] = js.native
  
  /**
    * Indicates whether the stage is managed by API Gateway.
    */
  var ApiGatewayManaged: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether updates to an API automatically trigger a new deployment.
    */
  var AutoDeploy: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates when the stage was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[AwsApiGatewayV2RouteSettings] = js.native
  
  /**
    * The identifier of the deployment that the stage is associated with. 
    */
  var DeploymentId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the last deployment of a stage. Supported only if the stage has automatic deployment enabled.
    */
  var LastDeploymentStatusMessage: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the stage was most recently updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastUpdatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The route settings for the stage.
    */
  var RouteSettings: js.UndefOr[AwsApiGatewayV2RouteSettings] = js.native
  
  /**
    * The name of the stage.
    */
  var StageName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A map that defines the stage variables for the stage. Variable names can have alphanumeric and underscore characters. Variable values can contain the following characters:   Uppercase and lowercase letters   Numbers   Special characters -._~:/?#&amp;=,  
    */
  var StageVariables: js.UndefOr[FieldMap] = js.native
}
object AwsApiGatewayV2StageDetails {
  
  @scala.inline
  def apply(): AwsApiGatewayV2StageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayV2StageDetails]
  }
  
  @scala.inline
  implicit class AwsApiGatewayV2StageDetailsMutableBuilder[Self <: AwsApiGatewayV2StageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLogSettings(value: AwsApiGatewayAccessLogSettings): Self = StObject.set(x, "AccessLogSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogSettingsUndefined: Self = StObject.set(x, "AccessLogSettings", js.undefined)
    
    @scala.inline
    def setApiGatewayManaged(value: Boolean): Self = StObject.set(x, "ApiGatewayManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiGatewayManagedUndefined: Self = StObject.set(x, "ApiGatewayManaged", js.undefined)
    
    @scala.inline
    def setAutoDeploy(value: Boolean): Self = StObject.set(x, "AutoDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeployUndefined: Self = StObject.set(x, "AutoDeploy", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDefaultRouteSettings(value: AwsApiGatewayV2RouteSettings): Self = StObject.set(x, "DefaultRouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRouteSettingsUndefined: Self = StObject.set(x, "DefaultRouteSettings", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastDeploymentStatusMessage(value: NonEmptyString): Self = StObject.set(x, "LastDeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeploymentStatusMessageUndefined: Self = StObject.set(x, "LastDeploymentStatusMessage", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: NonEmptyString): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setRouteSettings(value: AwsApiGatewayV2RouteSettings): Self = StObject.set(x, "RouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSettingsUndefined: Self = StObject.set(x, "RouteSettings", js.undefined)
    
    @scala.inline
    def setStageName(value: NonEmptyString): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
    
    @scala.inline
    def setStageVariables(value: FieldMap): Self = StObject.set(x, "StageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariablesUndefined: Self = StObject.set(x, "StageVariables", js.undefined)
  }
}
