package typings.awsServerlessExpress

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typings.awsServerlessExpress.middlewareMod.NonFunctionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Context extends StObject {
    
    var context: NonFunctionProperties[typings.awsLambda.handlerMod.Context] = js.native
    
    var event: OmitAPIGatewayProxyEventb = js.native
  }
  object Context {
    
    @scala.inline
    def apply(
      context: NonFunctionProperties[typings.awsLambda.handlerMod.Context],
      event: OmitAPIGatewayProxyEventb
    ): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: NonFunctionProperties[typings.awsLambda.handlerMod.Context]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: OmitAPIGatewayProxyEventb): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<aws-lambda.aws-lambda.APIGatewayProxyEvent, 'body'> */
  @js.native
  trait OmitAPIGatewayProxyEventb extends StObject {
    
    var headers: StringDictionary[String] = js.native
    
    var httpMethod: String = js.native
    
    var isBase64Encoded: Boolean = js.native
    
    var multiValueHeaders: StringDictionary[js.Array[String]] = js.native
    
    var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.native
    
    var path: String = js.native
    
    var pathParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var queryStringParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext] = js.native
    
    var resource: String = js.native
    
    var stageVariables: js.UndefOr[StringDictionary[String] | Null] = js.native
  }
  object OmitAPIGatewayProxyEventb {
    
    @scala.inline
    def apply(
      headers: StringDictionary[String],
      httpMethod: String,
      isBase64Encoded: Boolean,
      multiValueHeaders: StringDictionary[js.Array[String]],
      path: String,
      requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext],
      resource: String
    ): OmitAPIGatewayProxyEventb = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitAPIGatewayProxyEventb]
    }
    
    @scala.inline
    implicit class OmitAPIGatewayProxyEventbMutableBuilder[Self <: OmitAPIGatewayProxyEventb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueQueryStringParametersNull: Self = StObject.set(x, "multiValueQueryStringParameters", null)
      
      @scala.inline
      def setMultiValueQueryStringParametersUndefined: Self = StObject.set(x, "multiValueQueryStringParameters", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      @scala.inline
      def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
      
      @scala.inline
      def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      @scala.inline
      def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      @scala.inline
      def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariables(value: StringDictionary[String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariablesNull: Self = StObject.set(x, "stageVariables", null)
      
      @scala.inline
      def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
    }
  }
}
