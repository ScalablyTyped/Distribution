package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateVaultLockOutput extends StObject {
  
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
  implicit class InitiateVaultLockOutputMutableBuilder[Self <: InitiateVaultLockOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLockId(value: String): Self = StObject.set(x, "lockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockIdUndefined: Self = StObject.set(x, "lockId", js.undefined)
  }
}
