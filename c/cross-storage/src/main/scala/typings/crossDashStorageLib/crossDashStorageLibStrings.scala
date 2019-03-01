package typings
package crossDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object crossDashStorageLibStrings {
  @js.native
  sealed trait clear extends CrossStorageMethod
  
  @js.native
  sealed trait del extends CrossStorageMethod
  
  @js.native
  sealed trait get extends CrossStorageMethod
  
  @js.native
  sealed trait getKeys extends CrossStorageMethod
  
  @js.native
  sealed trait set extends CrossStorageMethod
  
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def del: del = "del".asInstanceOf[del]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def getKeys: getKeys = "getKeys".asInstanceOf[getKeys]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
}

