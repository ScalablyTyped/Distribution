package typings.awsSdkClientKmsBrowser.mod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput
object EncryptInput {
  
  inline def apply(KeyId: String, Plaintext: ArrayBuffer | ArrayBufferView | String): EncryptInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptInput]
  }
}
