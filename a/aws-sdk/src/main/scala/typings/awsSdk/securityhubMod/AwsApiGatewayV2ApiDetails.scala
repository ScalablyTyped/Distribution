package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiGatewayV2ApiDetails extends StObject {
  
  /**
    * The URI of the API.  Uses the format  &lt;api-id&gt;.execute-api.&lt;region&gt;.amazonaws.com  The stage name is typically appended to the URI to form a complete path to a deployed API stage.
    */
  var ApiEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the API.
    */
  var ApiId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An API key selection expression. Supported only for WebSocket APIs. 
    */
  var ApiKeySelectionExpression: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[AwsCorsConfiguration] = js.undefined
  
  /**
    * Indicates when the API was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A description of the API.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The API protocol for the API. Valid values: WEBSOCKET | HTTP 
    */
  var ProtocolType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The route selection expression for the API. For HTTP APIs, must be ${request.method} ${request.path}. This is the default value for HTTP APIs. For WebSocket APIs, there is no default value.
    */
  var RouteSelectionExpression: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version identifier for the API.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsApiGatewayV2ApiDetails {
  
  inline def apply(): AwsApiGatewayV2ApiDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayV2ApiDetails]
  }
  
  extension [Self <: AwsApiGatewayV2ApiDetails](x: Self) {
    
    inline def setApiEndpoint(value: NonEmptyString): Self = StObject.set(x, "ApiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setApiEndpointUndefined: Self = StObject.set(x, "ApiEndpoint", js.undefined)
    
    inline def setApiId(value: NonEmptyString): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setApiIdUndefined: Self = StObject.set(x, "ApiId", js.undefined)
    
    inline def setApiKeySelectionExpression(value: NonEmptyString): Self = StObject.set(x, "ApiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setApiKeySelectionExpressionUndefined: Self = StObject.set(x, "ApiKeySelectionExpression", js.undefined)
    
    inline def setCorsConfiguration(value: AwsCorsConfiguration): Self = StObject.set(x, "CorsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCorsConfigurationUndefined: Self = StObject.set(x, "CorsConfiguration", js.undefined)
    
    inline def setCreatedDate(value: NonEmptyString): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProtocolType(value: NonEmptyString): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    inline def setProtocolTypeUndefined: Self = StObject.set(x, "ProtocolType", js.undefined)
    
    inline def setRouteSelectionExpression(value: NonEmptyString): Self = StObject.set(x, "RouteSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setRouteSelectionExpressionUndefined: Self = StObject.set(x, "RouteSelectionExpression", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
