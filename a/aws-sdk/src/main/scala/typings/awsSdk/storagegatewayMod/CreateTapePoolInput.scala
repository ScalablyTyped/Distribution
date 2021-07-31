package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTapePoolInput extends StObject {
  
  /**
    * The name of the new custom tape pool.
    */
  var PoolName: typings.awsSdk.storagegatewayMod.PoolName
  
  /**
    * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days).
    */
  var RetentionLockTimeInDays: js.UndefOr[typings.awsSdk.storagegatewayMod.RetentionLockTimeInDays] = js.undefined
  
  /**
    * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account.
    */
  var RetentionLockType: js.UndefOr[typings.awsSdk.storagegatewayMod.RetentionLockType] = js.undefined
  
  /**
    * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
    */
  var StorageClass: TapeStorageClass
  
  /**
    * A list of up to 50 tags that can be assigned to tape pool. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
}
object CreateTapePoolInput {
  
  @scala.inline
  def apply(PoolName: PoolName, StorageClass: TapeStorageClass): CreateTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any], StorageClass = StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTapePoolInput]
  }
  
  @scala.inline
  implicit class CreateTapePoolInputMutableBuilder[Self <: CreateTapePoolInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionLockTimeInDays(value: RetentionLockTimeInDays): Self = StObject.set(x, "RetentionLockTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionLockTimeInDaysUndefined: Self = StObject.set(x, "RetentionLockTimeInDays", js.undefined)
    
    @scala.inline
    def setRetentionLockType(value: RetentionLockType): Self = StObject.set(x, "RetentionLockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionLockTypeUndefined: Self = StObject.set(x, "RetentionLockType", js.undefined)
    
    @scala.inline
    def setStorageClass(value: TapeStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
