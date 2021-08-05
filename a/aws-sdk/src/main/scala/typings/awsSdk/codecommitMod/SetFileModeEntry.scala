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
  
  inline def apply(fileMode: FileModeTypeEnum, filePath: Path): SetFileModeEntry = {
    val __obj = js.Dynamic.literal(fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFileModeEntry]
  }
  
  extension [Self <: SetFileModeEntry](x: Self) {
    
    inline def setFileMode(value: FileModeTypeEnum): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
