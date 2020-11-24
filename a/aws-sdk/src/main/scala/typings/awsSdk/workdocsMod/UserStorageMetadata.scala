package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStorageMetadata extends js.Object {
  
  /**
    * The storage for a user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.native
  
  /**
    * The amount of storage used, in bytes.
    */
  var StorageUtilizedInBytes: js.UndefOr[SizeType] = js.native
}
object UserStorageMetadata {
  
  @scala.inline
  def apply(): UserStorageMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStorageMetadata]
  }
  
  @scala.inline
  implicit class UserStorageMetadataOps[Self <: UserStorageMetadata] (val x: Self) extends AnyVal {
    
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
    def setStorageRule(value: StorageRuleType): Self = this.set("StorageRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageRule: Self = this.set("StorageRule", js.undefined)
    
    @scala.inline
    def setStorageUtilizedInBytes(value: SizeType): Self = this.set("StorageUtilizedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageUtilizedInBytes: Self = this.set("StorageUtilizedInBytes", js.undefined)
  }
}
