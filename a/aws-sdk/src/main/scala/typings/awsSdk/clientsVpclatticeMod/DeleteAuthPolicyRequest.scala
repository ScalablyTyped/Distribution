package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuthPolicyRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the resource.
    */
  var resourceIdentifier: ResourceIdentifier
}
object DeleteAuthPolicyRequest {
  
  inline def apply(resourceIdentifier: ResourceIdentifier): DeleteAuthPolicyRequest = {
    val __obj = js.Dynamic.literal(resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuthPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAuthPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
