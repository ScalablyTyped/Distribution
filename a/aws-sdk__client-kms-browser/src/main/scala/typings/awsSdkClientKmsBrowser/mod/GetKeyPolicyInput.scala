package typings.awsSdkClientKmsBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPolicyInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput
object GetKeyPolicyInput {
  
  @scala.inline
  def apply(KeyId: String, PolicyName: String): GetKeyPolicyInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPolicyInput]
  }
}
