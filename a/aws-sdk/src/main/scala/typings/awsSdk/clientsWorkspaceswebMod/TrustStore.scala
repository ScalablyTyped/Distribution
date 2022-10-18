package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustStore extends StObject {
  
  /**
    * A list of web portal ARNs that this trust store is associated with.
    */
  var associatedPortalArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: js.UndefOr[ARN] = js.undefined
}
object TrustStore {
  
  inline def apply(): TrustStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustStore]
  }
  
  extension [Self <: TrustStore](x: Self) {
    
    inline def setAssociatedPortalArns(value: ArnList): Self = StObject.set(x, "associatedPortalArns", value.asInstanceOf[js.Any])
    
    inline def setAssociatedPortalArnsUndefined: Self = StObject.set(x, "associatedPortalArns", js.undefined)
    
    inline def setAssociatedPortalArnsVarargs(value: ARN*): Self = StObject.set(x, "associatedPortalArns", js.Array(value*))
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArnUndefined: Self = StObject.set(x, "trustStoreArn", js.undefined)
  }
}
