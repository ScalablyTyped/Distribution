package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 文件
trait SavedFileData extends StObject {
  
  /** 文件的保存路径 */
  var savedFilePath: String
}
object SavedFileData {
  
  @scala.inline
  def apply(savedFilePath: String): SavedFileData = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFileData]
  }
  
  @scala.inline
  implicit class SavedFileDataMutableBuilder[Self <: SavedFileData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSavedFilePath(value: String): Self = StObject.set(x, "savedFilePath", value.asInstanceOf[js.Any])
  }
}
