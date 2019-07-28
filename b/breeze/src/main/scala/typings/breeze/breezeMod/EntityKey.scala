package typings.breeze.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityKey")
@js.native
class EntityKey protected ()
  extends typings.breeze.breezeNs.EntityKey {
  def this(entityType: typings.breeze.breezeNs.EntityType, keyValue: js.Any) = this()
  def this(entityType: typings.breeze.breezeNs.EntityType, keyValues: js.Array[_]) = this()
}

/* static members */
@JSImport("breeze", "EntityKey")
@js.native
object EntityKey extends js.Object {
  def equals(k1: typings.breeze.breezeNs.EntityKey, k2: typings.breeze.breezeNs.EntityKey): Boolean = js.native
}

