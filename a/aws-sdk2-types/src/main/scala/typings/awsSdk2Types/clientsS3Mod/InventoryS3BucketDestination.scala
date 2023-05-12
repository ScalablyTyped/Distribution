package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryS3BucketDestination extends StObject {
  
  /**
    * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.    Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.  
    */
  var AccountId: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.AccountId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
    */
  var Bucket: BucketName
  
  /**
    * Contains the type of server-side encryption used to encrypt the inventory results.
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.undefined
  
  /**
    * Specifies the output format of the inventory results.
    */
  var Format: InventoryFormat
  
  /**
    * The prefix that is prepended to all inventory results.
    */
  var Prefix: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Prefix] = js.undefined
}
object InventoryS3BucketDestination {
  
  inline def apply(Bucket: BucketName, Format: InventoryFormat): InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryS3BucketDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryS3BucketDestination] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: InventoryEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setFormat(value: InventoryFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
