package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFilesData extends StObject {
  
  /** 文件的临时路径 */
  var tempFilePaths: String
  
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    * @version 1.2.0
    */
  var tempFiles: js.Array[TempFile]
}
object TempFilesData {
  
  @scala.inline
  def apply(tempFilePaths: String, tempFiles: js.Array[TempFile]): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilesData]
  }
  
  @scala.inline
  implicit class TempFilesDataMutableBuilder[Self <: TempFilesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePaths(value: String): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFiles(value: js.Array[TempFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilesVarargs(value: TempFile*): Self = StObject.set(x, "tempFiles", js.Array(value :_*))
  }
}
