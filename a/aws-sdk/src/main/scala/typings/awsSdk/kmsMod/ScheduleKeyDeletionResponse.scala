package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleKeyDeletionResponse extends StObject {
  
  /**
    * The date and time after which AWS KMS deletes the customer master key (CMK).
    */
  var DeletionDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK whose deletion is scheduled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}
object ScheduleKeyDeletionResponse {
  
  inline def apply(): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
  
  extension [Self <: ScheduleKeyDeletionResponse](x: Self) {
    
    inline def setDeletionDate(value: DateType): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
