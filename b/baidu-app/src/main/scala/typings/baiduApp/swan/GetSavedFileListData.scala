package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileListData extends StObject {
  
  /**
    * 文件列表
    */
  var fileList: js.Array[File]
}
object GetSavedFileListData {
  
  inline def apply(fileList: js.Array[File]): GetSavedFileListData = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileListData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSavedFileListData] (val x: Self) extends AnyVal {
    
    inline def setFileList(value: js.Array[File]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: File*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
