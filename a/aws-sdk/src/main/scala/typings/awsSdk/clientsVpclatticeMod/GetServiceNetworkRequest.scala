package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceNetworkRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network.
    */
  var serviceNetworkIdentifier: ServiceNetworkIdentifier
}
object GetServiceNetworkRequest {
  
  inline def apply(serviceNetworkIdentifier: ServiceNetworkIdentifier): GetServiceNetworkRequest = {
    val __obj = js.Dynamic.literal(serviceNetworkIdentifier = serviceNetworkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceNetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceNetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceNetworkIdentifier(value: ServiceNetworkIdentifier): Self = StObject.set(x, "serviceNetworkIdentifier", value.asInstanceOf[js.Any])
  }
}
