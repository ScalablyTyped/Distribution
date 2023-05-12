package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthPolicyRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network or service.
    */
  var resourceIdentifier: ResourceIdentifier
}
object GetAuthPolicyRequest {
  
  inline def apply(resourceIdentifier: ResourceIdentifier): GetAuthPolicyRequest = {
    val __obj = js.Dynamic.literal(resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAuthPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
