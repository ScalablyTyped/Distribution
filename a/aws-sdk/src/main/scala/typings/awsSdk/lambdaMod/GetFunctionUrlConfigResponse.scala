package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionUrlConfigResponse extends StObject {
  
  /**
    * The type of authentication that your function URL uses. Set to AWS_IAM if you want to restrict access to authenticated IAM users only. Set to NONE if you want to bypass IAM authentication to create a public endpoint. For more information, see  Security and auth model for Lambda function URLs.
    */
  var AuthType: FunctionUrlAuthType
  
  /**
    * The cross-origin resource sharing (CORS) settings for your function URL.
    */
  var Cors: js.UndefOr[typings.awsSdk.lambdaMod.Cors] = js.undefined
  
  /**
    * When the function URL was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreationTime: Timestamp
  
  /**
    * The Amazon Resource Name (ARN) of your function.
    */
  var FunctionArn: typings.awsSdk.lambdaMod.FunctionArn
  
  /**
    * The HTTP URL endpoint for your function.
    */
  var FunctionUrl: typings.awsSdk.lambdaMod.FunctionUrl
  
  /**
    * When the function URL configuration was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModifiedTime: Timestamp
}
object GetFunctionUrlConfigResponse {
  
  inline def apply(
    AuthType: FunctionUrlAuthType,
    CreationTime: Timestamp,
    FunctionArn: FunctionArn,
    FunctionUrl: FunctionUrl,
    LastModifiedTime: Timestamp
  ): GetFunctionUrlConfigResponse = {
    val __obj = js.Dynamic.literal(AuthType = AuthType.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FunctionArn = FunctionArn.asInstanceOf[js.Any], FunctionUrl = FunctionUrl.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionUrlConfigResponse]
  }
  
  extension [Self <: GetFunctionUrlConfigResponse](x: Self) {
    
    inline def setAuthType(value: FunctionUrlAuthType): Self = StObject.set(x, "AuthType", value.asInstanceOf[js.Any])
    
    inline def setCors(value: Cors): Self = StObject.set(x, "Cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "Cors", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionUrl(value: FunctionUrl): Self = StObject.set(x, "FunctionUrl", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
