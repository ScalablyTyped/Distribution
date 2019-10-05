package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 本地缓存中的指定的 key */
  var key: String
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  def success_MGetStorageOptions(res: DataResponse): Unit
}

object GetStorageOptions {
  @scala.inline
  def apply(
    key: String,
    success: DataResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetStorageOptions = {
    val __obj = js.Dynamic.literal(key = key, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetStorageOptions]
  }
}

