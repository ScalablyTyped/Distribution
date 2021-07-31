package typings.baiduApp.swan

import typings.baiduApp.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveImageToPhotosAlbumOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
    */
  var filePath: String
  
  @JSName("success")
  def success_MSaveImageToPhotosAlbumOptions(res: ErrMsg): Unit
}
object SaveImageToPhotosAlbumOptions {
  
  @scala.inline
  def apply(filePath: String, success: ErrMsg => Unit): SaveImageToPhotosAlbumOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[SaveImageToPhotosAlbumOptions]
  }
  
  @scala.inline
  implicit class SaveImageToPhotosAlbumOptionsMutableBuilder[Self <: SaveImageToPhotosAlbumOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ErrMsg => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
