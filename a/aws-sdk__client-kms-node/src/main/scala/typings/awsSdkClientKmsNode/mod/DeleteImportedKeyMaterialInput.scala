package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImportedKeyMaterialInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
object DeleteImportedKeyMaterialInput {
  
  inline def apply(KeyId: String): DeleteImportedKeyMaterialInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImportedKeyMaterialInput]
  }
}
