package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 数据缓存
trait SetStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要存储的内容 */
  var data: js.Any
  /** 本地缓存中的指定的 key */
  var key: java.lang.String
}

object SetStorageOptions {
  @scala.inline
  def apply(
    data: js.Any,
    key: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetStorageOptions = {
    val __obj = js.Dynamic.literal(data = data, key = key)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetStorageOptions]
  }
}

