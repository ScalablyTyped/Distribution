package typings.breeze.breezeMod

import typings.breeze.breezeNs.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityQuery")
@js.native
class EntityQuery ()
  extends typings.breeze.breezeNs.EntityQuery {
  def this(resourceName: String) = this()
  /** Create query from an expression tree */
  def this(tree: js.Object) = this()
}

/* static members */
@JSImport("breeze", "EntityQuery")
@js.native
object EntityQuery extends js.Object {
  def from(resourceName: String): typings.breeze.breezeNs.EntityQuery = js.native
  def fromEntities(entities: js.Array[Entity]): typings.breeze.breezeNs.EntityQuery = js.native
  def fromEntities(entity: Entity): typings.breeze.breezeNs.EntityQuery = js.native
  def fromEntityKey(entityKey: typings.breeze.breezeNs.EntityKey): typings.breeze.breezeNs.EntityQuery = js.native
  def fromEntityNavigation(entity: Entity, navigationProperty: typings.breeze.breezeNs.NavigationProperty): typings.breeze.breezeNs.EntityQuery = js.native
}

