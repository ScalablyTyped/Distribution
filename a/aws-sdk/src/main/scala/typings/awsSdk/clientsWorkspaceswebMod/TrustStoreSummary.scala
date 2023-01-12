package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustStoreSummary extends StObject {
  
  /**
    * The ARN of the trust store.
    */
  var trustStoreArn: js.UndefOr[ARN] = js.undefined
}
object TrustStoreSummary {
  
  inline def apply(): TrustStoreSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustStoreSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustStoreSummary] (val x: Self) extends AnyVal {
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArnUndefined: Self = StObject.set(x, "trustStoreArn", js.undefined)
  }
}
