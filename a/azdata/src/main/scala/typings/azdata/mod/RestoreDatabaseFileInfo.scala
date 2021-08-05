package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDatabaseFileInfo extends StObject {
  
  var fileType: String
  
  var logicalFileName: String
  
  var originalFileName: String
  
  var restoreAsFileName: String
}
object RestoreDatabaseFileInfo {
  
  inline def apply(fileType: String, logicalFileName: String, originalFileName: String, restoreAsFileName: String): RestoreDatabaseFileInfo = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], logicalFileName = logicalFileName.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], restoreAsFileName = restoreAsFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDatabaseFileInfo]
  }
  
  extension [Self <: RestoreDatabaseFileInfo](x: Self) {
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setLogicalFileName(value: String): Self = StObject.set(x, "logicalFileName", value.asInstanceOf[js.Any])
    
    inline def setOriginalFileName(value: String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
    
    inline def setRestoreAsFileName(value: String): Self = StObject.set(x, "restoreAsFileName", value.asInstanceOf[js.Any])
  }
}
