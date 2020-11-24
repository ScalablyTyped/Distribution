package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageLensDataExport extends js.Object {
  
  /**
    * A container for the bucket where the S3 Storage Lens metrics export will be located.
    */
  var S3BucketDestination: typings.awsSdk.s3controlMod.S3BucketDestination = js.native
}
object StorageLensDataExport {
  
  @scala.inline
  def apply(S3BucketDestination: S3BucketDestination): StorageLensDataExport = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLensDataExport]
  }
  
  @scala.inline
  implicit class StorageLensDataExportOps[Self <: StorageLensDataExport] (val x: Self) extends AnyVal {
    
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
    def setS3BucketDestination(value: S3BucketDestination): Self = this.set("S3BucketDestination", value.asInstanceOf[js.Any])
  }
}
