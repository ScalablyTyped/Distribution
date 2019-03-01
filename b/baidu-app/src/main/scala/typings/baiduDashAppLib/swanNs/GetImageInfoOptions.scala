package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
  		 */
  var src: java.lang.String
}

object GetImageInfoOptions {
  @scala.inline
  def apply(
    src: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetImageInfoOptions]
  }
}

