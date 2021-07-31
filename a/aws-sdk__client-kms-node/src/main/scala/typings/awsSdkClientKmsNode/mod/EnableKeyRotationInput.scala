package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableKeyRotationInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
object EnableKeyRotationInput {
  
  @scala.inline
  def apply(KeyId: String): EnableKeyRotationInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableKeyRotationInput]
  }
}
