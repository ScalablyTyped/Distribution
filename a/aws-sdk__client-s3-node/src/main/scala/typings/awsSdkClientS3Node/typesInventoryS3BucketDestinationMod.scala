package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.CSV
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ORC
import typings.awsSdkClientS3Node.typesInventoryEncryptionMod.InventoryEncryption
import typings.awsSdkClientS3Node.typesInventoryEncryptionMod.UnmarshalledInventoryEncryption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryS3BucketDestinationMod {
  
  trait InventoryS3BucketDestination extends StObject {
    
    /**
      * <p>The ID of the account that owns the destination bucket.</p>
      */
    var AccountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Amazon resource name (ARN) of the bucket where inventory results will be published.</p>
      */
    var Bucket: String
    
    /**
      * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
      */
    var Encryption: js.UndefOr[InventoryEncryption] = js.undefined
    
    /**
      * <p>Specifies the output format of the inventory results.</p>
      */
    var Format: CSV | ORC | String
    
    /**
      * <p>The prefix that is prepended to all inventory results.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
  }
  object InventoryS3BucketDestination {
    
    inline def apply(Bucket: String, Format: CSV | ORC | String): InventoryS3BucketDestination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventoryS3BucketDestination]
    }
    
    extension [Self <: InventoryS3BucketDestination](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: InventoryEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      inline def setFormat(value: CSV | ORC | String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    }
  }
  
  trait UnmarshalledInventoryS3BucketDestination
    extends StObject
       with InventoryS3BucketDestination {
    
    /**
      * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
      */
    @JSName("Encryption")
    var Encryption_UnmarshalledInventoryS3BucketDestination: js.UndefOr[UnmarshalledInventoryEncryption] = js.undefined
  }
  object UnmarshalledInventoryS3BucketDestination {
    
    inline def apply(Bucket: String, Format: CSV | ORC | String): UnmarshalledInventoryS3BucketDestination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledInventoryS3BucketDestination]
    }
    
    extension [Self <: UnmarshalledInventoryS3BucketDestination](x: Self) {
      
      inline def setEncryption(value: UnmarshalledInventoryEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    }
  }
}
