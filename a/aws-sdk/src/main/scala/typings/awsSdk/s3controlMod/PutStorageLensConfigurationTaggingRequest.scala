package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutStorageLensConfigurationTaggingRequest extends js.Object {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID of the S3 Storage Lens configuration.
    */
  var ConfigId: typings.awsSdk.s3controlMod.ConfigId = js.native
  
  /**
    * The tag set of the S3 Storage Lens configuration.  You can set up to a maximum of 50 tags. 
    */
  var Tags: StorageLensTags = js.native
}
object PutStorageLensConfigurationTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ConfigId: ConfigId, Tags: StorageLensTags): PutStorageLensConfigurationTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStorageLensConfigurationTaggingRequest]
  }
  
  @scala.inline
  implicit class PutStorageLensConfigurationTaggingRequestOps[Self <: PutStorageLensConfigurationTaggingRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: ConfigId): Self = this.set("ConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: StorageLensTag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: StorageLensTags): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
}
