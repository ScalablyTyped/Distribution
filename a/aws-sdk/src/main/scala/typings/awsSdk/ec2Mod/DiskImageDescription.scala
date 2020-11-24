package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskImageDescription extends js.Object {
  
  /**
    * The checksum computed for the disk image.
    */
  var Checksum: js.UndefOr[String] = js.native
  
  /**
    * The disk image format.
    */
  var Format: js.UndefOr[DiskImageFormat] = js.native
  
  /**
    * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the Authenticating REST Requests topic in the Amazon Simple Storage Service Developer Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  var ImportManifestUrl: js.UndefOr[String] = js.native
  
  /**
    * The size of the disk image, in GiB.
    */
  var Size: js.UndefOr[Long] = js.native
}
object DiskImageDescription {
  
  @scala.inline
  def apply(): DiskImageDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImageDescription]
  }
  
  @scala.inline
  implicit class DiskImageDescriptionOps[Self <: DiskImageDescription] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: String): Self = this.set("Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("Checksum", js.undefined)
    
    @scala.inline
    def setFormat(value: DiskImageFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setImportManifestUrl(value: String): Self = this.set("ImportManifestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportManifestUrl: Self = this.set("ImportManifestUrl", js.undefined)
    
    @scala.inline
    def setSize(value: Long): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
}
