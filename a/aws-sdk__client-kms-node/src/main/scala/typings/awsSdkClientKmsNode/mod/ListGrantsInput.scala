package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGrantsInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput
object ListGrantsInput {
  
  inline def apply(KeyId: String): ListGrantsInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGrantsInput]
  }
}
