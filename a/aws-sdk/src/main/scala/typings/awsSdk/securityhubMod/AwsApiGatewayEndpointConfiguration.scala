package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiGatewayEndpointConfiguration extends StObject {
  
  /**
    * A list of endpoint types for the REST API. For an edge-optimized API, the endpoint type is EDGE. For a Regional API, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var Types: js.UndefOr[NonEmptyStringList] = js.undefined
}
object AwsApiGatewayEndpointConfiguration {
  
  inline def apply(): AwsApiGatewayEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayEndpointConfiguration]
  }
  
  extension [Self <: AwsApiGatewayEndpointConfiguration](x: Self) {
    
    inline def setTypes(value: NonEmptyStringList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    inline def setTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Types", js.Array(value*))
  }
}
