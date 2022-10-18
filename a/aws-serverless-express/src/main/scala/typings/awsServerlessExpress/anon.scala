package typings.awsServerlessExpress

import typings.awsLambda.commonApiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.commonApiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventHeaders
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventMultiValueHeaders
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventMultiValueQueryStringParameters
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventPathParameters
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventQueryStringParameters
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventStageVariables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<aws-lambda.aws-lambda.APIGatewayProxyEvent, 'body'> */
  trait OmitAPIGatewayProxyEventb extends StObject {
    
    var headers: APIGatewayProxyEventHeaders
    
    var httpMethod: String
    
    var isBase64Encoded: Boolean
    
    var multiValueHeaders: APIGatewayProxyEventMultiValueHeaders
    
    var multiValueQueryStringParameters: js.UndefOr[APIGatewayProxyEventMultiValueQueryStringParameters | Null] = js.undefined
    
    var path: String
    
    var pathParameters: js.UndefOr[APIGatewayProxyEventPathParameters | Null] = js.undefined
    
    var queryStringParameters: js.UndefOr[APIGatewayProxyEventQueryStringParameters | Null] = js.undefined
    
    var requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
    
    var resource: String
    
    var stageVariables: js.UndefOr[APIGatewayProxyEventStageVariables | Null] = js.undefined
  }
  object OmitAPIGatewayProxyEventb {
    
    inline def apply(
      headers: APIGatewayProxyEventHeaders,
      httpMethod: String,
      isBase64Encoded: Boolean,
      multiValueHeaders: APIGatewayProxyEventMultiValueHeaders,
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext],
      resource: String
    ): OmitAPIGatewayProxyEventb = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitAPIGatewayProxyEventb]
    }
    
    extension [Self <: OmitAPIGatewayProxyEventb](x: Self) {
      
      inline def setHeaders(value: APIGatewayProxyEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeaders(value: APIGatewayProxyEventMultiValueHeaders): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      inline def setMultiValueQueryStringParameters(value: APIGatewayProxyEventMultiValueQueryStringParameters): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      inline def setMultiValueQueryStringParametersUndefined: Self = StObject.set(x, "multiValueQueryStringParameters", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathParameters(value: APIGatewayProxyEventPathParameters): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      inline def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
      
      inline def setQueryStringParameters(value: APIGatewayProxyEventQueryStringParameters): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      inline def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      inline def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setStageVariables(value: APIGatewayProxyEventStageVariables): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      inline def setStageVariablesNull: Self = StObject.set(x, "stageVariables", null)
      
      inline def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
    }
  }
}
