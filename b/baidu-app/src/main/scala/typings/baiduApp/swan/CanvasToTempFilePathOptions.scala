package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 画布标识，传入 <canvas/> 的 cavas-id
    */
  var canvasId: String = js.native
      // 输出图片宽度（默认为 width * 屏幕像素密度）
  var destHeight: js.UndefOr[Double] = js.native
      // 画布高度（默认为 canvas 高度 - y）
  var destWidth: js.UndefOr[Double] = js.native
      // 输出图片高度（默认为 height * 屏幕像素密度）
  var fileType: js.UndefOr[String] = js.native
      // 画布宽度（默认为 canvas 宽度 - x）
  var height: js.UndefOr[Double] = js.native
      // 画布 y 轴起点（默认 0 ）
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
      // 画布 x 轴起点（默认 0 ）
  var y: js.UndefOr[Double] = js.native
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(canvasId: String): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
  @scala.inline
  implicit class CanvasToTempFilePathOptionsOps[Self <: CanvasToTempFilePathOptions] (val x: Self) extends AnyVal {
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
    def setCanvasId(value: String): Self = this.set("canvasId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestHeight(value: Double): Self = this.set("destHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestHeight: Self = this.set("destHeight", js.undefined)
    @scala.inline
    def setDestWidth(value: Double): Self = this.set("destWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestWidth: Self = this.set("destWidth", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

