package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketOpts extends CommonArgs {
  
  var bucketName: String = js.native
  
  var bucketType: BucketType = js.native
}
object CreateBucketOpts {
  
  @scala.inline
  def apply(bucketName: String, bucketType: BucketType): CreateBucketOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], bucketType = bucketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketOpts]
  }
  
  @scala.inline
  implicit class CreateBucketOptsMutableBuilder[Self <: CreateBucketOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketType(value: BucketType): Self = StObject.set(x, "bucketType", value.asInstanceOf[js.Any])
  }
}
