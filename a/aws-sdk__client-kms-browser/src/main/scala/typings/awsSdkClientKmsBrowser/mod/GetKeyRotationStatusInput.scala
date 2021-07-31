package typings.awsSdkClientKmsBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyRotationStatusInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
object GetKeyRotationStatusInput {
  
  @scala.inline
  def apply(KeyId: String): GetKeyRotationStatusInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyRotationStatusInput]
  }
}
