package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketOpts
  extends StObject
     with CommonArgs {
  
  var bucketName: String
  
  var bucketType: BucketType
}
object CreateBucketOpts {
  
  inline def apply(bucketName: String, bucketType: BucketType): CreateBucketOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], bucketType = bucketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBucketOpts] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketType(value: BucketType): Self = StObject.set(x, "bucketType", value.asInstanceOf[js.Any])
  }
}
