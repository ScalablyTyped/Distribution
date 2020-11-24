package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryDestination extends js.Object {
  
  /**
    * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.
    */
  var S3BucketDestination: InventoryS3BucketDestination = js.native
}
object InventoryDestination {
  
  @scala.inline
  def apply(S3BucketDestination: InventoryS3BucketDestination): InventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestination]
  }
  
  @scala.inline
  implicit class InventoryDestinationOps[Self <: InventoryDestination] (val x: Self) extends AnyVal {
    
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
    def setS3BucketDestination(value: InventoryS3BucketDestination): Self = this.set("S3BucketDestination", value.asInstanceOf[js.Any])
  }
}
