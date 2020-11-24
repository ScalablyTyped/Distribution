package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskImageDetail extends js.Object {
  
  /**
    * The size of the disk image, in GiB.
    */
  var Bytes: Long = js.native
  
  /**
    * The disk image format.
    */
  var Format: DiskImageFormat = js.native
  
  /**
    * A presigned URL for the import manifest stored in Amazon S3 and presented here as an Amazon S3 presigned URL. For information about creating a presigned URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the Authenticating REST Requests topic in the Amazon Simple Storage Service Developer Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  var ImportManifestUrl: String = js.native
}
object DiskImageDetail {
  
  @scala.inline
  def apply(Bytes: Long, Format: DiskImageFormat, ImportManifestUrl: String): DiskImageDetail = {
    val __obj = js.Dynamic.literal(Bytes = Bytes.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImportManifestUrl = ImportManifestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskImageDetail]
  }
  
  @scala.inline
  implicit class DiskImageDetailOps[Self <: DiskImageDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytes(value: Long): Self = this.set("Bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: DiskImageFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportManifestUrl(value: String): Self = this.set("ImportManifestUrl", value.asInstanceOf[js.Any])
  }
}
