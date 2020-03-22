package typings.awsServerlessExpress

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<aws-lambda.aws-lambda.APIGatewayProxyEvent, 'body'> */
trait OmitAPIGatewayProxyEventb extends js.Object {
  var headers: StringDictionary[String]
  var httpMethod: String
  var isBase64Encoded: Boolean
  var multiValueHeaders: StringDictionary[js.Array[String]]
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var path: String
  var pathParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var requestContext: APIGatewayEventRequestContext
  var resource: String
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.undefined
}

object OmitAPIGatewayProxyEventb {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpMethod: String,
    isBase64Encoded: Boolean,
    multiValueHeaders: StringDictionary[js.Array[String]],
    path: String,
    requestContext: APIGatewayEventRequestContext,
    resource: String,
    multiValueQueryStringParameters: StringDictionary[js.Array[String]] = null,
    pathParameters: StringDictionary[String] = null,
    queryStringParameters: StringDictionary[String] = null,
    stageVariables: StringDictionary[String] = null
  ): OmitAPIGatewayProxyEventb = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (multiValueQueryStringParameters != null) __obj.updateDynamic("multiValueQueryStringParameters")(multiValueQueryStringParameters.asInstanceOf[js.Any])
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters.asInstanceOf[js.Any])
    if (queryStringParameters != null) __obj.updateDynamic("queryStringParameters")(queryStringParameters.asInstanceOf[js.Any])
    if (stageVariables != null) __obj.updateDynamic("stageVariables")(stageVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAPIGatewayProxyEventb]
  }
}

