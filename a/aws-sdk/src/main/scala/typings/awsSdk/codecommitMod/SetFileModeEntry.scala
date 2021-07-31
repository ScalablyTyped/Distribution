package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFileModeEntry extends StObject {
  
  /**
    * The file mode for the file.
    */
  var fileMode: FileModeTypeEnum
  
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path
}
object SetFileModeEntry {
  
  @scala.inline
  def apply(fileMode: FileModeTypeEnum, filePath: Path): SetFileModeEntry = {
    val __obj = js.Dynamic.literal(fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFileModeEntry]
  }
  
  @scala.inline
  implicit class SetFileModeEntryMutableBuilder[Self <: SetFileModeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileMode(value: FileModeTypeEnum): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
