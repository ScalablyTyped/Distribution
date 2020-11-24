package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayV2StageDetails extends js.Object {
  
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
  implicit class AwsApiGatewayV2StageDetailsOps[Self <: AwsApiGatewayV2StageDetails] (val x: Self) extends AnyVal {
    
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
    def setApiGatewayManaged(value: Boolean): Self = this.set("ApiGatewayManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiGatewayManaged: Self = this.set("ApiGatewayManaged", js.undefined)
    
    @scala.inline
    def setAutoDeploy(value: Boolean): Self = this.set("AutoDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeploy: Self = this.set("AutoDeploy", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDefaultRouteSettings(value: AwsApiGatewayV2RouteSettings): Self = this.set("DefaultRouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteSettings: Self = this.set("DefaultRouteSettings", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: NonEmptyString): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLastDeploymentStatusMessage(value: NonEmptyString): Self = this.set("LastDeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeploymentStatusMessage: Self = this.set("LastDeploymentStatusMessage", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: NonEmptyString): Self = this.set("LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setRouteSettings(value: AwsApiGatewayV2RouteSettings): Self = this.set("RouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSettings: Self = this.set("RouteSettings", js.undefined)
    
    @scala.inline
    def setStageName(value: NonEmptyString): Self = this.set("StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("StageName", js.undefined)
    
    @scala.inline
    def setStageVariables(value: FieldMap): Self = this.set("StageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageVariables: Self = this.set("StageVariables", js.undefined)
  }
}
