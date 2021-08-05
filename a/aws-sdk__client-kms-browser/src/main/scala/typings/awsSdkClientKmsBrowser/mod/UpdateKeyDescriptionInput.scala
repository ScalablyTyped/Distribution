package typings.awsSdkClientKmsBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKeyDescriptionInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
object UpdateKeyDescriptionInput {
  
  inline def apply(Description: String, KeyId: String): UpdateKeyDescriptionInput = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateKeyDescriptionInput]
  }
}
