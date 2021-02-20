package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileEntry extends StObject {
  
  /**
    * The full path of the file to be deleted, including the name of the file.
    */
  var filePath: Path = js.native
}
object DeleteFileEntry {
  
  @scala.inline
  def apply(filePath: Path): DeleteFileEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileEntry]
  }
  
  @scala.inline
  implicit class DeleteFileEntryMutableBuilder[Self <: DeleteFileEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
