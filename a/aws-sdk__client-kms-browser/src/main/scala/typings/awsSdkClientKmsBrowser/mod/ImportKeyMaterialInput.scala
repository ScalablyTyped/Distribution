package typings.awsSdkClientKmsBrowser.mod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportKeyMaterialInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
object ImportKeyMaterialInput {
  
  @scala.inline
  def apply(
    EncryptedKeyMaterial: ArrayBuffer | ArrayBufferView | String,
    ImportToken: ArrayBuffer | ArrayBufferView | String,
    KeyId: String
  ): ImportKeyMaterialInput = {
    val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyMaterialInput]
  }
}
