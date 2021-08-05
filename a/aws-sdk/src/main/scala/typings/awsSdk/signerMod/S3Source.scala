package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Source extends StObject {
  
  /**
    * Name of the S3 bucket.
    */
  var bucketName: BucketName
  
  /**
    * Key name of the bucket object that contains your unsigned code.
    */
  var key: Key_
  
  /**
    * Version of your source image in your version enabled S3 bucket.
    */
  var version: Version
}
object S3Source {
  
  inline def apply(bucketName: BucketName, key: Key_, version: Version): S3Source = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Source]
  }
  
  extension [Self <: S3Source](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Key_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
