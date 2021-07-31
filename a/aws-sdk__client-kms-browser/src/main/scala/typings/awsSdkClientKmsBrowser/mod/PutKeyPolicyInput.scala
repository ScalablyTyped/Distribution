package typings.awsSdkClientKmsBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutKeyPolicyInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput
object PutKeyPolicyInput {
  
  @scala.inline
  def apply(KeyId: String, Policy: String, PolicyName: String): PutKeyPolicyInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutKeyPolicyInput]
  }
}
