package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateVaultLockOutput extends js.Object {
  
  /**
    * The lock ID, which is used to complete the vault locking process.
    */
  var lockId: js.UndefOr[String] = js.native
}
object InitiateVaultLockOutput {
  
  @scala.inline
  def apply(): InitiateVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateVaultLockOutput]
  }
  
  @scala.inline
  implicit class InitiateVaultLockOutputOps[Self <: InitiateVaultLockOutput] (val x: Self) extends AnyVal {
    
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
    def setLockId(value: String): Self = this.set("lockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockId: Self = this.set("lockId", js.undefined)
  }
}
