package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStorageLensConfigurationTaggingRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The ID of the S3 Storage Lens configuration.
    */
  var ConfigId: typings.awsSdk.s3controlMod.ConfigId
}
object DeleteStorageLensConfigurationTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ConfigId: ConfigId): DeleteStorageLensConfigurationTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStorageLensConfigurationTaggingRequest]
  }
  
  @scala.inline
  implicit class DeleteStorageLensConfigurationTaggingRequestMutableBuilder[Self <: DeleteStorageLensConfigurationTaggingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: ConfigId): Self = StObject.set(x, "ConfigId", value.asInstanceOf[js.Any])
  }
}
