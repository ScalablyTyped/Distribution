package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryS3BucketDestination extends StObject {
  
  /**
    * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.    Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.  
    */
  var AccountId: js.UndefOr[typings.awsSdk.s3Mod.AccountId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
    */
  var Bucket: BucketName = js.native
  
  /**
    * Contains the type of server-side encryption used to encrypt the inventory results.
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.native
  
  /**
    * Specifies the output format of the inventory results.
    */
  var Format: InventoryFormat = js.native
  
  /**
    * The prefix that is prepended to all inventory results.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
}
object InventoryS3BucketDestination {
  
  @scala.inline
  def apply(Bucket: BucketName, Format: InventoryFormat): InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryS3BucketDestination]
  }
  
  @scala.inline
  implicit class InventoryS3BucketDestinationMutableBuilder[Self <: InventoryS3BucketDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: InventoryEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setFormat(value: InventoryFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
