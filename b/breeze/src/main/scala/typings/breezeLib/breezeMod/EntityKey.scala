package typings
package breezeLib.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityKey")
@js.native
class EntityKey protected ()
  extends breezeLib.breezeNs.EntityKey {
  def this(entityType: breezeLib.breezeNs.EntityType, keyValue: js.Any) = this()
  def this(entityType: breezeLib.breezeNs.EntityType, keyValues: js.Array[_]) = this()
}

/* static members */
@JSImport("breeze", "EntityKey")
@js.native
object EntityKey extends js.Object {
  def equals(k1: breezeLib.breezeNs.EntityKey, k2: breezeLib.breezeNs.EntityKey): scala.Boolean = js.native
}

