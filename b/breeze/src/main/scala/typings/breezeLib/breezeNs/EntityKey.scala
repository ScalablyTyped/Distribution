package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityKey")
@js.native
class EntityKey protected () extends js.Object {
  def this(entityType: EntityType, keyValue: js.Any) = this()
  def this(entityType: EntityType, keyValues: js.Array[_]) = this()
  var entityType: EntityType = js.native
  var values: js.Array[_] = js.native
  def equals(entityKey: EntityKey): scala.Boolean = js.native
}

@JSGlobal("breeze.EntityKey")
@js.native
object EntityKey extends js.Object {
  def equals(k1: breezeLib.breezeNs.EntityKey, k2: breezeLib.breezeNs.EntityKey): scala.Boolean = js.native
}

