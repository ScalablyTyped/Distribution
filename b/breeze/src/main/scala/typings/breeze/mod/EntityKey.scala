package typings.breeze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityKey")
@js.native
class EntityKey protected ()
  extends typings.breeze.breeze.EntityKey {
  def this(entityType: typings.breeze.breeze.EntityType, keyValue: js.Any) = this()
  def this(entityType: typings.breeze.breeze.EntityType, keyValues: js.Array[_]) = this()
  /* CompleteClass */
  override var entityType: typings.breeze.breeze.EntityType = js.native
  /* CompleteClass */
  override var values: js.Array[_] = js.native
  /* CompleteClass */
  override def equals(entityKey: typings.breeze.breeze.EntityKey): Boolean = js.native
}

/* static members */
@JSImport("breeze", "EntityKey")
@js.native
object EntityKey extends js.Object {
  def equals(k1: typings.breeze.breeze.EntityKey, k2: typings.breeze.breeze.EntityKey): Boolean = js.native
}

