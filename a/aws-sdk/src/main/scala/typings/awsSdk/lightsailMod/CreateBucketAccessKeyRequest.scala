package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketAccessKeyRequest extends StObject {
  
  /**
    * The name of the bucket that the new access key will belong to, and grant access to.
    */
  var bucketName: BucketName
}
object CreateBucketAccessKeyRequest {
  
  inline def apply(bucketName: BucketName): CreateBucketAccessKeyRequest = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketAccessKeyRequest]
  }
  
  extension [Self <: CreateBucketAccessKeyRequest](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
  }
}
