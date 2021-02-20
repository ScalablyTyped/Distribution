package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageAclOptions extends TimeoutIntervalOptions {
  
  var leaseId: js.UndefOr[String] = js.native
  
  var signedIdentifiers: js.Array[SignedIdentifier] = js.native
}
object StorageAclOptions {
  
  @scala.inline
  def apply(signedIdentifiers: js.Array[SignedIdentifier]): StorageAclOptions = {
    val __obj = js.Dynamic.literal(signedIdentifiers = signedIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAclOptions]
  }
  
  @scala.inline
  implicit class StorageAclOptionsMutableBuilder[Self <: StorageAclOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaseId(value: String): Self = StObject.set(x, "leaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseIdUndefined: Self = StObject.set(x, "leaseId", js.undefined)
    
    @scala.inline
    def setSignedIdentifiers(value: js.Array[SignedIdentifier]): Self = StObject.set(x, "signedIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedIdentifiersVarargs(value: SignedIdentifier*): Self = StObject.set(x, "signedIdentifiers", js.Array(value :_*))
  }
}
