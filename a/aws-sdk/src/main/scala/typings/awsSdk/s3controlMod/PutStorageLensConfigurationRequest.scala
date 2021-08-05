package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutStorageLensConfigurationRequest extends StObject {
  
  /**
    * The account ID of the requester.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The ID of the S3 Storage Lens configuration.
    */
  var ConfigId: typings.awsSdk.s3controlMod.ConfigId
  
  /**
    * The S3 Storage Lens configuration.
    */
  var StorageLensConfiguration: typings.awsSdk.s3controlMod.StorageLensConfiguration
  
  /**
    * The tag set of the S3 Storage Lens configuration.  You can set up to a maximum of 50 tags. 
    */
  var Tags: js.UndefOr[StorageLensTags] = js.undefined
}
object PutStorageLensConfigurationRequest {
  
  inline def apply(AccountId: AccountId, ConfigId: ConfigId, StorageLensConfiguration: StorageLensConfiguration): PutStorageLensConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigId = ConfigId.asInstanceOf[js.Any], StorageLensConfiguration = StorageLensConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStorageLensConfigurationRequest]
  }
  
  extension [Self <: PutStorageLensConfigurationRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setConfigId(value: ConfigId): Self = StObject.set(x, "ConfigId", value.asInstanceOf[js.Any])
    
    inline def setStorageLensConfiguration(value: StorageLensConfiguration): Self = StObject.set(x, "StorageLensConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTags(value: StorageLensTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: StorageLensTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
