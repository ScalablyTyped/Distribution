package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTrustStoreRequest extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object DisassociateTrustStoreRequest {
  
  inline def apply(portalArn: ARN): DisassociateTrustStoreRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrustStoreRequest]
  }
  
  extension [Self <: DisassociateTrustStoreRequest](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
