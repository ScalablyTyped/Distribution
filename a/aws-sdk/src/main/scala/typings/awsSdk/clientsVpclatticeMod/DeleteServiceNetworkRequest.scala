package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceNetworkRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) or ID of the service network.
    */
  var serviceNetworkIdentifier: ServiceNetworkIdentifier
}
object DeleteServiceNetworkRequest {
  
  inline def apply(serviceNetworkIdentifier: ServiceNetworkIdentifier): DeleteServiceNetworkRequest = {
    val __obj = js.Dynamic.literal(serviceNetworkIdentifier = serviceNetworkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceNetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceNetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceNetworkIdentifier(value: ServiceNetworkIdentifier): Self = StObject.set(x, "serviceNetworkIdentifier", value.asInstanceOf[js.Any])
  }
}
