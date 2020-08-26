package typings.baiduApp.swan

import typings.baiduApp.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveImageToPhotosAlbumOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
    */
  var filePath: String = js.native
  @JSName("success")
  def success_MSaveImageToPhotosAlbumOptions(res: ErrMsg): Unit = js.native
}

object SaveImageToPhotosAlbumOptions {
  @scala.inline
  def apply(filePath: String, success: ErrMsg => Unit): SaveImageToPhotosAlbumOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[SaveImageToPhotosAlbumOptions]
  }
  @scala.inline
  implicit class SaveImageToPhotosAlbumOptionsOps[Self <: SaveImageToPhotosAlbumOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: ErrMsg => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

