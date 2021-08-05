package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketInventoryConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket where the inventory configuration will be stored.
    */
  var Bucket: BucketName
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId
  
  /**
    * Specifies the inventory configuration.
    */
  var InventoryConfiguration: typings.awsSdk.s3Mod.InventoryConfiguration
}
object PutBucketInventoryConfigurationRequest {
  
  inline def apply(Bucket: BucketName, Id: InventoryId, InventoryConfiguration: InventoryConfiguration): PutBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketInventoryConfigurationRequest]
  }
  
  extension [Self <: PutBucketInventoryConfigurationRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setId(value: InventoryId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setInventoryConfiguration(value: InventoryConfiguration): Self = StObject.set(x, "InventoryConfiguration", value.asInstanceOf[js.Any])
  }
}
