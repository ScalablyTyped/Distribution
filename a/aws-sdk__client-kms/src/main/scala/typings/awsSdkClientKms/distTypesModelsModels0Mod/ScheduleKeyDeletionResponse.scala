package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleKeyDeletionResponse extends StObject {
  
  /**
    * <p>The date and time after which KMS deletes the KMS key.</p>
    *          <p>If the KMS key is a multi-Region primary key with replica keys, this field does not
    *       appear. The deletion date for the primary key isn't known until its last replica key is
    *       deleted.</p>
    */
  var DeletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the KMS key whose deletion is scheduled.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The current status of the KMS key.</p>
    *          <p>For more information about how key state affects the use of a KMS key, see
    *       <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var KeyState: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.KeyState | String] = js.undefined
  
  /**
    * <p>The waiting period before the KMS key is deleted. </p>
    *          <p>If the KMS key is a multi-Region primary key with replicas, the waiting period begins when
    *       the last of its replica keys is deleted. Otherwise, the waiting period begins
    *       immediately.</p>
    */
  var PendingWindowInDays: js.UndefOr[Double] = js.undefined
}
object ScheduleKeyDeletionResponse {
  
  inline def apply(): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleKeyDeletionResponse] (val x: Self) extends AnyVal {
    
    inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyState(value: KeyState | String): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
    
    inline def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
    
    inline def setPendingWindowInDays(value: Double): Self = StObject.set(x, "PendingWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setPendingWindowInDaysUndefined: Self = StObject.set(x, "PendingWindowInDays", js.undefined)
  }
}
