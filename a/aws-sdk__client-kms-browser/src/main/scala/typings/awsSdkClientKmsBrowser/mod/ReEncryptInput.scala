package typings.awsSdkClientKmsBrowser.mod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReEncryptInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput
object ReEncryptInput {
  
  inline def apply(CiphertextBlob: ArrayBuffer | ArrayBufferView | String, DestinationKeyId: String): ReEncryptInput = {
    val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReEncryptInput]
  }
}
