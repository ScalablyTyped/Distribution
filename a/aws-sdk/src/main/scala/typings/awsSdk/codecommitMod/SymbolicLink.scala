package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolicLink extends js.Object {
  
  /**
    * The fully qualified path to the folder that contains the symbolic link.
    */
  var absolutePath: js.UndefOr[Path] = js.native
  
  /**
    * The blob ID that contains the information about the symbolic link.
    */
  var blobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The file mode permissions of the blob that cotains information about the symbolic link.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
  
  /**
    * The relative path of the symbolic link from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.native
}
object SymbolicLink {
  
  @scala.inline
  def apply(): SymbolicLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolicLink]
  }
  
  @scala.inline
  implicit class SymbolicLinkOps[Self <: SymbolicLink] (val x: Self) extends AnyVal {
    
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
