package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editor.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataApi extends js.Object {
  def getData(): String
  def setData(data: String): Unit
}

object DataApi {
  @scala.inline
  def apply(getData: () => String, setData: String => Unit): DataApi = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[DataApi]
  }
}

