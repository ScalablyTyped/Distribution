package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBucketOpts
  extends StObject
     with CommonArgs {
  
  var bucketId: String
  
  var bucketType: BucketType
}
object UpdateBucketOpts {
  
  inline def apply(bucketId: String, bucketType: BucketType): UpdateBucketOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], bucketType = bucketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBucketOpts]
  }
  
  extension [Self <: UpdateBucketOpts](x: Self) {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setBucketType(value: BucketType): Self = StObject.set(x, "bucketType", value.asInstanceOf[js.Any])
  }
}
