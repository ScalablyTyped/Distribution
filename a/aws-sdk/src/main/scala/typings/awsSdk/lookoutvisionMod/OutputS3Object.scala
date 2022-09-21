package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputS3Object extends StObject {
  
  /**
    * The bucket that contains the training output.
    */
  var Bucket: S3BucketName
  
  /**
    * The location of the training output in the bucket.
    */
  var Key: S3ObjectKey
}
object OutputS3Object {
  
  inline def apply(Bucket: S3BucketName, Key: S3ObjectKey): OutputS3Object = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputS3Object]
  }
  
  extension [Self <: OutputS3Object](x: Self) {
    
    inline def setBucket(value: S3BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
