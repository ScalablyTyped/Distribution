package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrustStoreResponse extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: ARN
}
object AssociateTrustStoreResponse {
  
  inline def apply(portalArn: ARN, trustStoreArn: ARN): AssociateTrustStoreResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTrustStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateTrustStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
