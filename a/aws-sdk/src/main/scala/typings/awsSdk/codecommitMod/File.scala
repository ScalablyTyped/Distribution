package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  /**
    * The fully qualified path to the file in the repository.
    */
  var absolutePath: js.UndefOr[Path] = js.native
  
  /**
    * The blob ID that contains the file information.
    */
  var blobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
  
  /**
    * The relative path of the file from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.native
}
object File {
  
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setAbsolutePath(value: Path): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    
    @scala.inline
    def setBlobId(value: ObjectId): Self = this.set("blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobId: Self = this.set("blobId", js.undefined)
    
    @scala.inline
    def setFileMode(value: FileModeTypeEnum): Self = this.set("fileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileMode: Self = this.set("fileMode", js.undefined)
    
    @scala.inline
    def setRelativePath(value: Path): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePath: Self = this.set("relativePath", js.undefined)
  }
}
