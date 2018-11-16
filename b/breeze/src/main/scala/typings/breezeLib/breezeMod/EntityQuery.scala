package typings
package breezeLib.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityQuery")
@js.native
class EntityQuery ()
  extends breezeLib.breezeNs.EntityQuery {
  def this(resourceName: java.lang.String) = this()
  /** Create query from an expression tree */
  def this(tree: js.Object) = this()
}

@JSImport("breeze", "EntityQuery")
@js.native
object EntityQuery extends js.Object {
  def from(resourceName: java.lang.String): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntities(entities: js.Array[breezeLib.breezeNs.Entity]): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntities(entity: breezeLib.breezeNs.Entity): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntityKey(entityKey: breezeLib.breezeNs.EntityKey): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntityNavigation(entity: breezeLib.breezeNs.Entity, navigationProperty: breezeLib.breezeNs.NavigationProperty): breezeLib.breezeNs.EntityQuery = js.native
}

