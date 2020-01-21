package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 当前显示图片的链接，不填则默认为 urls 的第一张 */
  var current: js.UndefOr[String] = js.undefined
  /** 需要预览的图片链接列表 */
  var urls: js.Array[String]
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    urls: js.Array[String],
    complete: /* res */ js.Any => Unit = null,
    current: String = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

