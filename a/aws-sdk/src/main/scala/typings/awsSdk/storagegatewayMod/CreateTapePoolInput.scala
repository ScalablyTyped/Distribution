package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTapePoolInput extends js.Object {
  
  /**
    * The name of the new custom tape pool.
    */
  var PoolName: typings.awsSdk.storagegatewayMod.PoolName = js.native
  
  /**
    * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
    */
  var RetentionLockTimeInDays: js.UndefOr[typings.awsSdk.storagegatewayMod.RetentionLockTimeInDays] = js.native
  
  /**
    * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account.
    */
  var RetentionLockType: js.UndefOr[typings.awsSdk.storagegatewayMod.RetentionLockType] = js.native
  
  /**
    * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
    */
  var StorageClass: TapeStorageClass = js.native
  
  /**
    * A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
}
object CreateTapePoolInput {
  
  @scala.inline
  def apply(PoolName: PoolName, StorageClass: TapeStorageClass): CreateTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any], StorageClass = StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTapePoolInput]
  }
  
  @scala.inline
  implicit class CreateTapePoolInputOps[Self <: CreateTapePoolInput] (val x: Self) extends AnyVal {
    
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
    def setPoolName(value: PoolName): Self = this.set("PoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClass(value: TapeStorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionLockTimeInDays(value: RetentionLockTimeInDays): Self = this.set("RetentionLockTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionLockTimeInDays: Self = this.set("RetentionLockTimeInDays", js.undefined)
    
    @scala.inline
    def setRetentionLockType(value: RetentionLockType): Self = this.set("RetentionLockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionLockType: Self = this.set("RetentionLockType", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
