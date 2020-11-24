package typings.backblazeB2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBucketOpts extends CommonArgs {
  
  var bucketId: String = js.native
  
  var bucketType: BucketType = js.native
}
object UpdateBucketOpts {
  
  @scala.inline
  def apply(bucketId: String, bucketType: BucketType): UpdateBucketOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], bucketType = bucketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBucketOpts]
  }
  
  @scala.inline
  implicit class UpdateBucketOptsOps[Self <: UpdateBucketOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketId(value: String): Self = this.set("bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketType(value: BucketType): Self = this.set("bucketType", value.asInstanceOf[js.Any])
  }
}
