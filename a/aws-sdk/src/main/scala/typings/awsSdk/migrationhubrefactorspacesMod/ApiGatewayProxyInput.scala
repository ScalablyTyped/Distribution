package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiGatewayProxyInput extends StObject {
  
  /**
    * The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value is set to REGIONAL by default. If the value is set to PRIVATE in the request, this creates a private API endpoint that is isolated from the public internet. The private endpoint can only be accessed by using Amazon Virtual Private Cloud (Amazon VPC) endpoints for Amazon API Gateway that have been granted access. 
    */
  var EndpointType: js.UndefOr[ApiGatewayEndpointType] = js.undefined
  
  /**
    * The name of the API Gateway stage. The name defaults to prod. 
    */
  var StageName: js.UndefOr[typings.awsSdk.migrationhubrefactorspacesMod.StageName] = js.undefined
}
object ApiGatewayProxyInput {
  
  inline def apply(): ApiGatewayProxyInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiGatewayProxyInput]
  }
  
  extension [Self <: ApiGatewayProxyInput](x: Self) {
    
    inline def setEndpointType(value: ApiGatewayEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
  }
}
