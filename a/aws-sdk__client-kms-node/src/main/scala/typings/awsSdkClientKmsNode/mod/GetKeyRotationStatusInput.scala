package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyRotationStatusInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
object GetKeyRotationStatusInput {
  
  inline def apply(KeyId: String): GetKeyRotationStatusInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyRotationStatusInput]
  }
}
