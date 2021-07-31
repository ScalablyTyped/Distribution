package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolicLink extends StObject {
  
  /**
    * The fully qualified path to the folder that contains the symbolic link.
    */
  var absolutePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The blob ID that contains the information about the symbolic link.
    */
  var blobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The file mode permissions of the blob that cotains information about the symbolic link.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  
  /**
    * The relative path of the symbolic link from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.undefined
}
object SymbolicLink {
  
  @scala.inline
  def apply(): SymbolicLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolicLink]
  }
  
  @scala.inline
  implicit class SymbolicLinkMutableBuilder[Self <: SymbolicLink] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRelativePath(value: Path): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
  }
}
