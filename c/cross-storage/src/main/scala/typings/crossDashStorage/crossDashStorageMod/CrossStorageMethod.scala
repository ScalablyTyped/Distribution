package typings.crossDashStorage.crossDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.crossDashStorage.crossDashStorageStrings.get
  - typings.crossDashStorage.crossDashStorageStrings.set
  - typings.crossDashStorage.crossDashStorageStrings.del
  - typings.crossDashStorage.crossDashStorageStrings.getKeys
  - typings.crossDashStorage.crossDashStorageStrings.clear
*/
trait CrossStorageMethod extends js.Object

object CrossStorageMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typings.crossDashStorage.crossDashStorageStrings.clear = this.cast("clear")
  @scala.inline
  def del: typings.crossDashStorage.crossDashStorageStrings.del = this.cast("del")
  @scala.inline
  def get: typings.crossDashStorage.crossDashStorageStrings.get = this.cast("get")
  @scala.inline
  def getKeys: typings.crossDashStorage.crossDashStorageStrings.getKeys = this.cast("getKeys")
  @scala.inline
  def set: typings.crossDashStorage.crossDashStorageStrings.set = this.cast("set")
}

