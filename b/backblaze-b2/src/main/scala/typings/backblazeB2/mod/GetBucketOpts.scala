package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketOpts
  extends StObject
     with CommonArgs {
  
  var bucketId: js.UndefOr[String] = js.undefined
  
  var bucketName: String
}
object GetBucketOpts {
  
  inline def apply(bucketName: String): GetBucketOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketOpts] (val x: Self) extends AnyVal {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
  }
}
