package typings.chrome.chrome.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browsingData.remove")
@js.native
object remove extends js.Object {
  def apply(options: RemovalOptions, dataToRemove: DataTypeSet): Unit = js.native
  def apply(options: RemovalOptions, dataToRemove: DataTypeSet, callback: js.Function0[Unit]): Unit = js.native
}

