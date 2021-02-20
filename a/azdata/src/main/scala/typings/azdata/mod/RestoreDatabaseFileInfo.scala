package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDatabaseFileInfo extends StObject {
  
  var fileType: String = js.native
  
  var logicalFileName: String = js.native
  
  var originalFileName: String = js.native
  
  var restoreAsFileName: String = js.native
}
object RestoreDatabaseFileInfo {
  
  @scala.inline
  def apply(fileType: String, logicalFileName: String, originalFileName: String, restoreAsFileName: String): RestoreDatabaseFileInfo = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], logicalFileName = logicalFileName.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], restoreAsFileName = restoreAsFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDatabaseFileInfo]
  }
  
  @scala.inline
  implicit class RestoreDatabaseFileInfoMutableBuilder[Self <: RestoreDatabaseFileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalFileName(value: String): Self = StObject.set(x, "logicalFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFileName(value: String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreAsFileName(value: String): Self = StObject.set(x, "restoreAsFileName", value.asInstanceOf[js.Any])
  }
}
