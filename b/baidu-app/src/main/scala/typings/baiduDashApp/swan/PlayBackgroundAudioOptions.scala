package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  /** 音乐链接 */
  var dataUrl: String
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.undefined
}

object PlayBackgroundAudioOptions {
  @scala.inline
  def apply(
    dataUrl: String,
    complete: /* res */ js.Any => Unit = null,
    coverImgUrl: String = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null,
    title: String = null
  ): PlayBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlayBackgroundAudioOptions]
  }
}

