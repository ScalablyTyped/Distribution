package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 音乐位置，单位：秒 */
  var position: scala.Double
}

object SeekBackgroundAudioOptions {
  @scala.inline
  def apply(
    position: scala.Double,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): SeekBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(position = position)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SeekBackgroundAudioOptions]
  }
}

