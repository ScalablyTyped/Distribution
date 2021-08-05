package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeGrantInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
object RevokeGrantInput {
  
  inline def apply(GrantId: String, KeyId: String): RevokeGrantInput = {
    val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeGrantInput]
  }
}
