package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceNetworkResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service network.
    */
  var arn: js.UndefOr[ServiceNetworkArn] = js.undefined
  
  /**
    * The type of IAM policy.
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    * The ID of the service network.
    */
  var id: js.UndefOr[ServiceNetworkId] = js.undefined
  
  /**
    * The name of the service network.
    */
  var name: js.UndefOr[ServiceNetworkName] = js.undefined
}
object UpdateServiceNetworkResponse {
  
  inline def apply(): UpdateServiceNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceNetworkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceNetworkResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceNetworkArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setId(value: ServiceNetworkId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ServiceNetworkName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
