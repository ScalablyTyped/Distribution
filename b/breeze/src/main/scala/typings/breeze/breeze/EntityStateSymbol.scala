package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityStateSymbol")
@js.native
class EntityStateSymbol () extends EnumSymbol {
  def isAdded(): Boolean = js.native
  def isAddedModifiedOrDeleted(): Boolean = js.native
  def isDeleted(): Boolean = js.native
  def isDetached(): Boolean = js.native
  def isModified(): Boolean = js.native
  def isUnchanged(): Boolean = js.native
  def isUnchangedOrModified(): Boolean = js.native
}

