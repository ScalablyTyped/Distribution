package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleKeyDeletionRequest extends StObject {
  
  /**
    * <p>The unique identifier of the KMS key to delete.</p>
    *          <p>Specify the key ID or key ARN of the KMS key.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The waiting period, specified in number of days. After the waiting period ends, KMS
    *       deletes the KMS key.</p>
    *          <p>If the KMS key is a multi-Region primary key with replica keys, the waiting period begins
    *       when the last of its replica keys is deleted. Otherwise, the waiting period begins
    *       immediately.</p>
    *          <p>This value is optional. If you include a value, it must be between 7 and 30, inclusive. If
    *       you do not include a value, it defaults to 30.</p>
    */
  var PendingWindowInDays: js.UndefOr[Double] = js.undefined
}
object ScheduleKeyDeletionRequest {
  
  inline def apply(): ScheduleKeyDeletionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleKeyDeletionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleKeyDeletionRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setPendingWindowInDays(value: Double): Self = StObject.set(x, "PendingWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setPendingWindowInDaysUndefined: Self = StObject.set(x, "PendingWindowInDays", js.undefined)
  }
}
