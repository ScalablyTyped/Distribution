package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutStorageLensConfigurationTaggingRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The ID of the S3 Storage Lens configuration.
    */
  var ConfigId: typings.awsSdk.s3controlMod.ConfigId
  
  /**
    * The tag set of the S3 Storage Lens configuration.  You can set up to a maximum of 50 tags. 
    */
  var Tags: StorageLensTags
}
object PutStorageLensConfigurationTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ConfigId: ConfigId, Tags: StorageLensTags): PutStorageLensConfigurationTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStorageLensConfigurationTaggingRequest]
  }
  
  @scala.inline
  implicit class PutStorageLensConfigurationTaggingRequestMutableBuilder[Self <: PutStorageLensConfigurationTaggingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: ConfigId): Self = StObject.set(x, "ConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StorageLensTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: StorageLensTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
