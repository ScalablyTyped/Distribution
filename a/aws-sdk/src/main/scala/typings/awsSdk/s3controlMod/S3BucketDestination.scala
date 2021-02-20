package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BucketDestination extends StObject {
  
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
  implicit class S3BucketDestinationMutableBuilder[Self <: S3BucketDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: S3BucketArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: StorageLensDataExportEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSchemaVersion(value: OutputSchemaVersion): Self = StObject.set(x, "OutputSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
