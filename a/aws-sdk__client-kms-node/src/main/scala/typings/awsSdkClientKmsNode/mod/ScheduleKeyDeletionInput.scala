package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleKeyDeletionInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
object ScheduleKeyDeletionInput {
  
  inline def apply(KeyId: String): ScheduleKeyDeletionInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleKeyDeletionInput]
  }
}
