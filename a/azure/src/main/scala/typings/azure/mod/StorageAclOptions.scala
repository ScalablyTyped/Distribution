package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageAclOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var leaseId: js.UndefOr[String] = js.undefined
  
  var signedIdentifiers: js.Array[SignedIdentifier]
}
object StorageAclOptions {
  
  inline def apply(signedIdentifiers: js.Array[SignedIdentifier]): StorageAclOptions = {
    val __obj = js.Dynamic.literal(signedIdentifiers = signedIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAclOptions]
  }
  
  extension [Self <: StorageAclOptions](x: Self) {
    
    inline def setLeaseId(value: String): Self = StObject.set(x, "leaseId", value.asInstanceOf[js.Any])
    
    inline def setLeaseIdUndefined: Self = StObject.set(x, "leaseId", js.undefined)
    
    inline def setSignedIdentifiers(value: js.Array[SignedIdentifier]): Self = StObject.set(x, "signedIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setSignedIdentifiersVarargs(value: SignedIdentifier*): Self = StObject.set(x, "signedIdentifiers", js.Array(value :_*))
  }
}
