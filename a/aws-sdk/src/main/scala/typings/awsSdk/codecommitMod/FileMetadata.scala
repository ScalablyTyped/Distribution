package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileMetadata extends StObject {
  
  /**
    * The full path to the file to be added or updated, including the name of the file.
    */
  var absolutePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The blob ID that contains the file information.
    */
  var blobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
}
object FileMetadata {
  
  @scala.inline
  def apply(): FileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileMetadata]
  }
  
  @scala.inline
  implicit class FileMetadataMutableBuilder[Self <: FileMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePath(value: Path): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    @scala.inline
    def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    @scala.inline
    def setFileMode(value: FileModeTypeEnum): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
  }
}
