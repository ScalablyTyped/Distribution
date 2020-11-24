package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageLensConfiguration extends js.Object {
  
  /**
    * A container for all the account-level configurations of your S3 Storage Lens configuration.
    */
  var AccountLevel: typings.awsSdk.s3controlMod.AccountLevel = js.native
  
  /**
    * A container for the AWS organization for this S3 Storage Lens configuration.
    */
  var AwsOrg: js.UndefOr[StorageLensAwsOrg] = js.native
  
  /**
    * A container to specify the properties of your S3 Storage Lens metrics export including, the destination, schema and format.
    */
  var DataExport: js.UndefOr[StorageLensDataExport] = js.native
  
  /**
    * A container for what is excluded in this configuration. This container can only be valid if there is no Include container submitted, and it's not empty. 
    */
  var Exclude: js.UndefOr[typings.awsSdk.s3controlMod.Exclude] = js.native
  
  /**
    * A container for the Amazon S3 Storage Lens configuration ID.
    */
  var Id: ConfigId = js.native
  
  /**
    * A container for what is included in this configuration. This container can only be valid if there is no Exclude container submitted, and it's not empty. 
    */
  var Include: js.UndefOr[typings.awsSdk.s3controlMod.Include] = js.native
  
  /**
    * A container for whether the S3 Storage Lens configuration is enabled.
    */
  var IsEnabled: typings.awsSdk.s3controlMod.IsEnabled = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and follows the following format:  arn:aws:s3:us-east-1:example-account-id:storage-lens/your-dashboard-name  
    */
  var StorageLensArn: js.UndefOr[typings.awsSdk.s3controlMod.StorageLensArn] = js.native
}
object StorageLensConfiguration {
  
  @scala.inline
  def apply(AccountLevel: AccountLevel, Id: ConfigId, IsEnabled: IsEnabled): StorageLensConfiguration = {
    val __obj = js.Dynamic.literal(AccountLevel = AccountLevel.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLensConfiguration]
  }
  
  @scala.inline
  implicit class StorageLensConfigurationOps[Self <: StorageLensConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAccountLevel(value: AccountLevel): Self = this.set("AccountLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ConfigId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: IsEnabled): Self = this.set("IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsOrg(value: StorageLensAwsOrg): Self = this.set("AwsOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsOrg: Self = this.set("AwsOrg", js.undefined)
    
    @scala.inline
    def setDataExport(value: StorageLensDataExport): Self = this.set("DataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExport: Self = this.set("DataExport", js.undefined)
    
    @scala.inline
    def setExclude(value: Exclude): Self = this.set("Exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("Exclude", js.undefined)
    
    @scala.inline
    def setInclude(value: Include): Self = this.set("Include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("Include", js.undefined)
    
    @scala.inline
    def setStorageLensArn(value: StorageLensArn): Self = this.set("StorageLensArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLensArn: Self = this.set("StorageLensArn", js.undefined)
  }
}
