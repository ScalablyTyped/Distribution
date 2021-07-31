package typings.awsSdkClientKmsBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelKeyDeletionInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
object CancelKeyDeletionInput {
  
  @scala.inline
  def apply(KeyId: String): CancelKeyDeletionInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelKeyDeletionInput]
  }
}
