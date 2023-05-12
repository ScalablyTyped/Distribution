package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceS3Configuration extends StObject {
  
  /**
    * The bucket name of the customer S3 bucket.
    */
  var BucketName: S3BucketName
  
  /**
    *  
    */
  var ObjectKeyPrefix: js.UndefOr[S3ObjectKey] = js.undefined
}
object DataSourceS3Configuration {
  
  inline def apply(BucketName: S3BucketName): DataSourceS3Configuration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceS3Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceS3Configuration] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyPrefix(value: S3ObjectKey): Self = StObject.set(x, "ObjectKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyPrefixUndefined: Self = StObject.set(x, "ObjectKeyPrefix", js.undefined)
  }
}
