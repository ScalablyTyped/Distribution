package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 本地缓存中的指定的 key */
  var key: java.lang.String
  /** 接口调用的回调函数,res = {data: key对应的内容} */
  @JSName("success")
  def success_MGetStorageOptions(res: DataResponse): scala.Unit
}

object GetStorageOptions {
  @scala.inline
  def apply(
    key: java.lang.String,
    success: js.Function1[DataResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetStorageOptions]
  }
}

