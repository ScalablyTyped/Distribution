package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStorageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): Unit = js.native
}

object GetStorageInfoOptions {
  @scala.inline
  def apply(success: StorageInfo => Unit): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
  @scala.inline
  implicit class GetStorageInfoOptionsOps[Self <: GetStorageInfoOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: StorageInfo => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

