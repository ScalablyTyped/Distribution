package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageLensConfigurationTaggingRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID of the Amazon S3 Storage Lens configuration.
    */
  var ConfigId: typings.awsSdk.s3controlMod.ConfigId = js.native
}
object GetStorageLensConfigurationTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ConfigId: ConfigId): GetStorageLensConfigurationTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageLensConfigurationTaggingRequest]
  }
  
  @scala.inline
  implicit class GetStorageLensConfigurationTaggingRequestMutableBuilder[Self <: GetStorageLensConfigurationTaggingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: ConfigId): Self = StObject.set(x, "ConfigId", value.asInstanceOf[js.Any])
  }
}
