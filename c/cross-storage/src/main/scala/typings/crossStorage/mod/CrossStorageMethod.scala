package typings.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.crossStorage.crossStorageStrings.get
  - typings.crossStorage.crossStorageStrings.set
  - typings.crossStorage.crossStorageStrings.del
  - typings.crossStorage.crossStorageStrings.getKeys
  - typings.crossStorage.crossStorageStrings.clear
*/
trait CrossStorageMethod extends js.Object

object CrossStorageMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typings.crossStorage.crossStorageStrings.clear = this.cast("clear")
  @scala.inline
  def del: typings.crossStorage.crossStorageStrings.del = this.cast("del")
  @scala.inline
  def get: typings.crossStorage.crossStorageStrings.get = this.cast("get")
  @scala.inline
  def getKeys: typings.crossStorage.crossStorageStrings.getKeys = this.cast("getKeys")
  @scala.inline
  def set: typings.crossStorage.crossStorageStrings.set = this.cast("set")
}

