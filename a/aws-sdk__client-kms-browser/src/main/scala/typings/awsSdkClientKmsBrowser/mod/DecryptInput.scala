package typings.awsSdkClientKmsBrowser.mod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput
object DecryptInput {
  
  @scala.inline
  def apply(CiphertextBlob: ArrayBuffer | ArrayBufferView | String): DecryptInput = {
    val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptInput]
  }
}
