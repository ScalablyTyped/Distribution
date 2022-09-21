package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBucketBundleRequest extends StObject {
  
  /**
    * The name of the bucket for which to update the bundle.
    */
  var bucketName: BucketName
  
  /**
    * The ID of the new bundle to apply to the bucket. Use the GetBucketBundles action to get a list of bundle IDs that you can specify.
    */
  var bundleId: NonEmptyString
}
object UpdateBucketBundleRequest {
  
  inline def apply(bucketName: BucketName, bundleId: NonEmptyString): UpdateBucketBundleRequest = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBucketBundleRequest]
  }
  
  extension [Self <: UpdateBucketBundleRequest](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
  }
}
