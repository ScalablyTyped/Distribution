package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageLensConfiguration extends StObject {
  
  /**
    * A container for all the account-level configurations of your S3 Storage Lens configuration.
    */
  var AccountLevel: typings.awsSdk.s3controlMod.AccountLevel
  
  /**
    * A container for the Amazon Web Services organization for this S3 Storage Lens configuration.
    */
  var AwsOrg: js.UndefOr[StorageLensAwsOrg] = js.undefined
  
  /**
    * A container to specify the properties of your S3 Storage Lens metrics export including, the destination, schema and format.
    */
  var DataExport: js.UndefOr[StorageLensDataExport] = js.undefined
  
  /**
    * A container for what is excluded in this configuration. This container can only be valid if there is no Include container submitted, and it's not empty. 
    */
  var Exclude: js.UndefOr[typings.awsSdk.s3controlMod.Exclude] = js.undefined
  
  /**
    * A container for the Amazon S3 Storage Lens configuration ID.
    */
  var Id: ConfigId
  
  /**
    * A container for what is included in this configuration. This container can only be valid if there is no Exclude container submitted, and it's not empty. 
    */
  var Include: js.UndefOr[typings.awsSdk.s3controlMod.Include] = js.undefined
  
  /**
    * A container for whether the S3 Storage Lens configuration is enabled.
    */
  var IsEnabled: typings.awsSdk.s3controlMod.IsEnabled
  
  /**
    * The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and follows the following format:  arn:aws:s3:us-east-1:example-account-id:storage-lens/your-dashboard-name  
    */
  var StorageLensArn: js.UndefOr[typings.awsSdk.s3controlMod.StorageLensArn] = js.undefined
}
object StorageLensConfiguration {
  
  inline def apply(AccountLevel: AccountLevel, Id: ConfigId, IsEnabled: IsEnabled): StorageLensConfiguration = {
    val __obj = js.Dynamic.literal(AccountLevel = AccountLevel.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLensConfiguration]
  }
  
  extension [Self <: StorageLensConfiguration](x: Self) {
    
    inline def setAccountLevel(value: AccountLevel): Self = StObject.set(x, "AccountLevel", value.asInstanceOf[js.Any])
    
    inline def setAwsOrg(value: StorageLensAwsOrg): Self = StObject.set(x, "AwsOrg", value.asInstanceOf[js.Any])
    
    inline def setAwsOrgUndefined: Self = StObject.set(x, "AwsOrg", js.undefined)
    
    inline def setDataExport(value: StorageLensDataExport): Self = StObject.set(x, "DataExport", value.asInstanceOf[js.Any])
    
    inline def setDataExportUndefined: Self = StObject.set(x, "DataExport", js.undefined)
    
    inline def setExclude(value: Exclude): Self = StObject.set(x, "Exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "Exclude", js.undefined)
    
    inline def setId(value: ConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: Include): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
    
    inline def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageLensArn(value: StorageLensArn): Self = StObject.set(x, "StorageLensArn", value.asInstanceOf[js.Any])
    
    inline def setStorageLensArnUndefined: Self = StObject.set(x, "StorageLensArn", js.undefined)
  }
}
