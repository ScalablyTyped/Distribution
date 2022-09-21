package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotSiteWiseCustomerManagedDatastoreS3Storage extends StObject {
  
  /**
    *  The name of the Amazon S3 bucket where your data is stored. 
    */
  var bucket: BucketName
  
  /**
    *  (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a forward slash (/). 
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
}
object IotSiteWiseCustomerManagedDatastoreS3Storage {
  
  inline def apply(bucket: BucketName): IotSiteWiseCustomerManagedDatastoreS3Storage = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotSiteWiseCustomerManagedDatastoreS3Storage]
  }
  
  extension [Self <: IotSiteWiseCustomerManagedDatastoreS3Storage](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
  }
}
