package typings.ckeditorCkeditor5Core.mod.editor.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataApi extends js.Object {
  def getData(): String = js.native
  def setData(data: String): Unit = js.native
}

object DataApi {
  @scala.inline
  def apply(getData: () => String, setData: String => Unit): DataApi = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[DataApi]
  }
  @scala.inline
  implicit class DataApiOps[Self <: DataApi] (val x: Self) extends AnyVal {
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
    def setGetData(value: () => String): Self = this.set("getData", js.Any.fromFunction0(value))
    @scala.inline
    def setSetData(value: String => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
  }
  
}

