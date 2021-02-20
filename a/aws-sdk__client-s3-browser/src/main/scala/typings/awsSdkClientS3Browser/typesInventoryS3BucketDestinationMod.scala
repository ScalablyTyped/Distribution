package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ORC
import typings.awsSdkClientS3Browser.typesInventoryEncryptionMod.InventoryEncryption
import typings.awsSdkClientS3Browser.typesInventoryEncryptionMod.UnmarshalledInventoryEncryption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryS3BucketDestinationMod {
  
  @js.native
  trait InventoryS3BucketDestination extends StObject {
    
    /**
      * <p>The ID of the account that owns the destination bucket.</p>
      */
    var AccountId: js.UndefOr[String] = js.native
    
    /**
      * <p>The Amazon resource name (ARN) of the bucket where inventory results will be published.</p>
      */
    var Bucket: String = js.native
    
    /**
      * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
      */
    var Encryption: js.UndefOr[InventoryEncryption] = js.native
    
    /**
      * <p>Specifies the output format of the inventory results.</p>
      */
    var Format: CSV | ORC | String = js.native
    
    /**
      * <p>The prefix that is prepended to all inventory results.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
  }
  object InventoryS3BucketDestination {
    
    @scala.inline
    def apply(Bucket: String, Format: CSV | ORC | String): InventoryS3BucketDestination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventoryS3BucketDestination]
    }
    
    @scala.inline
    implicit class InventoryS3BucketDestinationMutableBuilder[Self <: InventoryS3BucketDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryption(value: InventoryEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      @scala.inline
      def setFormat(value: CSV | ORC | String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledInventoryS3BucketDestination extends InventoryS3BucketDestination {
    
    /**
      * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
      */
    @JSName("Encryption")
    var Encryption_UnmarshalledInventoryS3BucketDestination: js.UndefOr[UnmarshalledInventoryEncryption] = js.native
  }
  object UnmarshalledInventoryS3BucketDestination {
    
    @scala.inline
    def apply(Bucket: String, Format: CSV | ORC | String): UnmarshalledInventoryS3BucketDestination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledInventoryS3BucketDestination]
    }
    
    @scala.inline
    implicit class UnmarshalledInventoryS3BucketDestinationMutableBuilder[Self <: UnmarshalledInventoryS3BucketDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryption(value: UnmarshalledInventoryEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    }
  }
}
