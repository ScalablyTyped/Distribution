package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantAccessResult extends StObject {
  
  /**
    * A TemporaryCredential object that contains the data needed to log in to the instance by RDP clients, such as the Microsoft Remote Desktop Connection.
    */
  var TemporaryCredential: js.UndefOr[typings.awsSdk.opsworksMod.TemporaryCredential] = js.native
}
object GrantAccessResult {
  
  @scala.inline
  def apply(): GrantAccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantAccessResult]
  }
  
  @scala.inline
  implicit class GrantAccessResultMutableBuilder[Self <: GrantAccessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemporaryCredential(value: TemporaryCredential): Self = StObject.set(x, "TemporaryCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryCredentialUndefined: Self = StObject.set(x, "TemporaryCredential", js.undefined)
  }
}
