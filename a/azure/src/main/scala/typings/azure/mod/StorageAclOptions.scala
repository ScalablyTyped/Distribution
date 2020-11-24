package typings.azure.mod

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
  implicit class StorageAclOptionsOps[Self <: StorageAclOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSignedIdentifiersVarargs(value: SignedIdentifier*): Self = this.set("signedIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setSignedIdentifiers(value: js.Array[SignedIdentifier]): Self = this.set("signedIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseId(value: String): Self = this.set("leaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseId: Self = this.set("leaseId", js.undefined)
  }
}
