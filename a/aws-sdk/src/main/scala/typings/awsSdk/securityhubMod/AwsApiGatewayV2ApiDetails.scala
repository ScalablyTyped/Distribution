package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayV2ApiDetails extends js.Object {
  
  /**
    * The URI of the API.  Uses the format  &lt;api-id&gt;.execute-api.&lt;region&gt;.amazonaws.com  The stage name is typically appended to the URI to form a complete path to a deployed API stage.
    */
  var ApiEndpoint: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the API.
    */
  var ApiId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * An API key selection expression. Supported only for WebSocket APIs. 
    */
  var ApiKeySelectionExpression: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[AwsCorsConfiguration] = js.native
  
  /**
    * Indicates when the API was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A description of the API.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The API protocol for the API. Valid values: WEBSOCKET | HTTP 
    */
  var ProtocolType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The route selection expression for the API. For HTTP APIs, must be ${request.method} ${request.path}. This is the default value for HTTP APIs. For WebSocket APIs, there is no default value.
    */
  var RouteSelectionExpression: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version identifier for the API.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
}
object AwsApiGatewayV2ApiDetails {
  
  @scala.inline
  def apply(): AwsApiGatewayV2ApiDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayV2ApiDetails]
  }
  
  @scala.inline
  implicit class AwsApiGatewayV2ApiDetailsOps[Self <: AwsApiGatewayV2ApiDetails] (val x: Self) extends AnyVal {
    
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
    def setApiEndpoint(value: NonEmptyString): Self = this.set("ApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiEndpoint: Self = this.set("ApiEndpoint", js.undefined)
    
    @scala.inline
    def setApiId(value: NonEmptyString): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiId: Self = this.set("ApiId", js.undefined)
    
    @scala.inline
    def setApiKeySelectionExpression(value: NonEmptyString): Self = this.set("ApiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeySelectionExpression: Self = this.set("ApiKeySelectionExpression", js.undefined)
    
    @scala.inline
    def setCorsConfiguration(value: AwsCorsConfiguration): Self = this.set("CorsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorsConfiguration: Self = this.set("CorsConfiguration", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProtocolType(value: NonEmptyString): Self = this.set("ProtocolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolType: Self = this.set("ProtocolType", js.undefined)
    
    @scala.inline
    def setRouteSelectionExpression(value: NonEmptyString): Self = this.set("RouteSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSelectionExpression: Self = this.set("RouteSelectionExpression", js.undefined)
    
    @scala.inline
    def setVersion(value: NonEmptyString): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
