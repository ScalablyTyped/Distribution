package typings.awsSdk.workspaceswebMod

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
  
  extension [Self <: AssociateTrustStoreResponse](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
