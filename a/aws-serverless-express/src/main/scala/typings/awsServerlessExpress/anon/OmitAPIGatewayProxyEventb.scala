package typings.awsServerlessExpress.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<aws-lambda.aws-lambda.APIGatewayProxyEvent, 'body'> */
@js.native
trait OmitAPIGatewayProxyEventb extends js.Object {
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
  implicit class OmitAPIGatewayProxyEventbOps[Self <: OmitAPIGatewayProxyEventb] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBase64Encoded(value: Boolean): Self = this.set("isBase64Encoded", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = this.set("requestContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueQueryStringParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueQueryStringParameters: Self = this.set("multiValueQueryStringParameters", js.undefined)
    @scala.inline
    def setMultiValueQueryStringParametersNull: Self = this.set("multiValueQueryStringParameters", null)
    @scala.inline
    def setPathParameters(value: StringDictionary[String]): Self = this.set("pathParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathParameters: Self = this.set("pathParameters", js.undefined)
    @scala.inline
    def setPathParametersNull: Self = this.set("pathParameters", null)
    @scala.inline
    def setQueryStringParameters(value: StringDictionary[String]): Self = this.set("queryStringParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryStringParameters: Self = this.set("queryStringParameters", js.undefined)
    @scala.inline
    def setQueryStringParametersNull: Self = this.set("queryStringParameters", null)
    @scala.inline
    def setStageVariables(value: StringDictionary[String]): Self = this.set("stageVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageVariables: Self = this.set("stageVariables", js.undefined)
    @scala.inline
    def setStageVariablesNull: Self = this.set("stageVariables", null)
  }
  
}

