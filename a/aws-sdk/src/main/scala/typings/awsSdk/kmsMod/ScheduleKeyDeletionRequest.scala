package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleKeyDeletionRequest extends StObject {
  
  /**
    * The unique identifier of the customer master key (CMK) to delete. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the customer master key (CMK). This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not include a value, it defaults to 30.
    */
  var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined
}
object ScheduleKeyDeletionRequest {
  
  @scala.inline
  def apply(KeyId: KeyIdType): ScheduleKeyDeletionRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleKeyDeletionRequest]
  }
  
  @scala.inline
  implicit class ScheduleKeyDeletionRequestMutableBuilder[Self <: ScheduleKeyDeletionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingWindowInDays(value: PendingWindowInDaysType): Self = StObject.set(x, "PendingWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingWindowInDaysUndefined: Self = StObject.set(x, "PendingWindowInDays", js.undefined)
  }
}
