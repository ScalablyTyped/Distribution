package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolInfo extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool. Use the ListTapePools operation to return a list of custom tape pools for your account and AWS Region.
    */
  var PoolARN: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolARN] = js.native
  
  /**
    * The name of the custom tape pool. PoolName can use all ASCII characters, except '/' and '\'.
    */
  var PoolName: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolName] = js.native
  
  /**
    * Status of the custom tape pool. Pool can be ACTIVE or DELETED.
    */
  var PoolStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolStatus] = js.native
  
  /**
    * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
    */
  var RetentionLockTimeInDays: js.UndefOr[typings.awsSdk.storagegatewayMod.RetentionLockTimeInDays] = js.native
  
  /**
    * Tape retention lock type, which can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account.
    */
  var RetentionLockType: js.UndefOr[typings.awsSdk.storagegatewayMod.RetentionLockType] = js.native
  
  /**
    * The storage class that is associated with the custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
    */
  var StorageClass: js.UndefOr[TapeStorageClass] = js.native
}
object PoolInfo {
  
  @scala.inline
  def apply(): PoolInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolInfo]
  }
  
  @scala.inline
  implicit class PoolInfoOps[Self <: PoolInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPoolARN(value: PoolARN): Self = this.set("PoolARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolARN: Self = this.set("PoolARN", js.undefined)
    
    @scala.inline
    def setPoolName(value: PoolName): Self = this.set("PoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolName: Self = this.set("PoolName", js.undefined)
    
    @scala.inline
    def setPoolStatus(value: PoolStatus): Self = this.set("PoolStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolStatus: Self = this.set("PoolStatus", js.undefined)
    
    @scala.inline
    def setRetentionLockTimeInDays(value: RetentionLockTimeInDays): Self = this.set("RetentionLockTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionLockTimeInDays: Self = this.set("RetentionLockTimeInDays", js.undefined)
    
    @scala.inline
    def setRetentionLockType(value: RetentionLockType): Self = this.set("RetentionLockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionLockType: Self = this.set("RetentionLockType", js.undefined)
    
    @scala.inline
    def setStorageClass(value: TapeStorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
}
