package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 封面URL */
  var coverImgUrl: js.UndefOr[java.lang.String] = js.undefined
  /** 音乐链接 */
  var dataUrl: java.lang.String
  /** 音乐标题 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlayBackgroundAudioOptions {
  @scala.inline
  def apply(
    dataUrl: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    coverImgUrl: java.lang.String = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null,
    title: java.lang.String = null
  ): PlayBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlayBackgroundAudioOptions]
  }
}

