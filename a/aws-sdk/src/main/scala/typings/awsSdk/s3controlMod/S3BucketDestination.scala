package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BucketDestination extends js.Object {
  
  /**
    * The account ID of the owner of the S3 Storage Lens metrics export bucket.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:  arn:aws:s3:us-east-1:example-account-id:bucket/your-destination-bucket-name  
    */
  var Arn: S3BucketArnString = js.native
  
  /**
    * The container for the type encryption of the metrics exports in this bucket.
    */
  var Encryption: js.UndefOr[StorageLensDataExportEncryption] = js.native
  
  /**
    * 
    */
  var Format: typings.awsSdk.s3controlMod.Format = js.native
  
  /**
    * The schema version of the export file.
    */
  var OutputSchemaVersion: typings.awsSdk.s3controlMod.OutputSchemaVersion = js.native
  
  /**
    * The prefix of the destination bucket where the metrics export will be delivered.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3controlMod.Prefix] = js.native
}
object S3BucketDestination {
  
  @scala.inline
  def apply(
    AccountId: AccountId,
    Arn: S3BucketArnString,
    Format: Format,
    OutputSchemaVersion: OutputSchemaVersion
  ): S3BucketDestination = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketDestination]
  }
  
  @scala.inline
  implicit class S3BucketDestinationOps[Self <: S3BucketDestination] (val x: Self) extends AnyVal {
    
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
    def setArn(value: S3BucketArnString): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Format): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSchemaVersion(value: OutputSchemaVersion): Self = this.set("OutputSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: StorageLensDataExportEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
  }
}
