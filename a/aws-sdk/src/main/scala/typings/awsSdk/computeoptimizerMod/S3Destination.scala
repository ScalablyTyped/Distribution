package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Destination extends js.Object {
  
  /**
    * The name of the Amazon S3 bucket used as the destination of an export file.
    */
  var bucket: js.UndefOr[DestinationBucket] = js.native
  
  /**
    * The Amazon S3 bucket key of an export file. The key uniquely identifies the object, or export file, in the S3 bucket.
    */
  var key: js.UndefOr[DestinationKey] = js.native
  
  /**
    * The Amazon S3 bucket key of a metadata file. The key uniquely identifies the object, or metadata file, in the S3 bucket.
    */
  var metadataKey: js.UndefOr[MetadataKey] = js.native
}
object S3Destination {
  
  @scala.inline
  def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  
  @scala.inline
  implicit class S3DestinationOps[Self <: S3Destination] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: DestinationBucket): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setKey(value: DestinationKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMetadataKey(value: MetadataKey): Self = this.set("metadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataKey: Self = this.set("metadataKey", js.undefined)
  }
}
