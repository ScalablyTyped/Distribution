package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveCreationOutput extends js.Object {
  
  /**
    * The ID of the archive. This value is also included as part of the location.
    */
  var archiveId: js.UndefOr[String] = js.native
  
  /**
    * The checksum of the archive computed by Amazon S3 Glacier.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * The relative URI path of the newly added archive resource.
    */
  var location: js.UndefOr[String] = js.native
}
object ArchiveCreationOutput {
  
  @scala.inline
  def apply(): ArchiveCreationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveCreationOutput]
  }
  
  @scala.inline
  implicit class ArchiveCreationOutputOps[Self <: ArchiveCreationOutput] (val x: Self) extends AnyVal {
    
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
    def setArchiveId(value: String): Self = this.set("archiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveId: Self = this.set("archiveId", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
