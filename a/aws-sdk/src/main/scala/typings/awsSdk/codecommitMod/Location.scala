package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  /**
    * The name of the file being compared, including its extension and subdirectory, if any.
    */
  var filePath: js.UndefOr[Path] = js.native
  
  /**
    * The position of a change in a compared file, in line number format.
    */
  var filePosition: js.UndefOr[Position] = js.native
  
  /**
    * In a comparison of commits or a pull request, whether the change is in the before or after of that comparison.
    */
  var relativeFileVersion: js.UndefOr[RelativeFileVersionEnum] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setFilePosition(value: Position): Self = StObject.set(x, "filePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePositionUndefined: Self = StObject.set(x, "filePosition", js.undefined)
    
    @scala.inline
    def setRelativeFileVersion(value: RelativeFileVersionEnum): Self = StObject.set(x, "relativeFileVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeFileVersionUndefined: Self = StObject.set(x, "relativeFileVersion", js.undefined)
  }
}
