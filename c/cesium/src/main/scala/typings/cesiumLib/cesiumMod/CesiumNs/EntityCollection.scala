package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityCollection extends js.Object {
  val collectionChanged: Event
  val id: java.lang.String
  val owner: DataSource | CompositeEntityCollection
  var show: scala.Boolean
  val values: js.Array[Entity]
  def add(entity: Entity): Entity
  def computeAvailability(): TimeInterval
  def contains(entity: Entity): scala.Boolean
  def getById(id: java.lang.String): Entity
  def getOrCreateEntity(id: java.lang.String): Entity
  def remove(entity: Entity): scala.Boolean
  def removeAll(): scala.Unit
  def removeById(id: java.lang.String): scala.Boolean
  def resumeEvents(): scala.Unit
  def suspendEvents(): scala.Unit
}

object EntityCollection {
  @scala.inline
  def apply(
    add: js.Function1[Entity, Entity],
    collectionChanged: Event,
    computeAvailability: js.Function0[TimeInterval],
    contains: js.Function1[Entity, scala.Boolean],
    getById: js.Function1[java.lang.String, Entity],
    getOrCreateEntity: js.Function1[java.lang.String, Entity],
    id: java.lang.String,
    owner: DataSource | CompositeEntityCollection,
    remove: js.Function1[Entity, scala.Boolean],
    removeAll: js.Function0[scala.Unit],
    removeById: js.Function1[java.lang.String, scala.Boolean],
    resumeEvents: js.Function0[scala.Unit],
    show: scala.Boolean,
    suspendEvents: js.Function0[scala.Unit],
    values: js.Array[Entity]
  ): EntityCollection = {
    val __obj = js.Dynamic.literal(add = add, collectionChanged = collectionChanged, computeAvailability = computeAvailability, contains = contains, getById = getById, getOrCreateEntity = getOrCreateEntity, id = id, owner = owner.asInstanceOf[js.Any], remove = remove, removeAll = removeAll, removeById = removeById, resumeEvents = resumeEvents, show = show, suspendEvents = suspendEvents, values = values)
  
    __obj.asInstanceOf[EntityCollection]
  }
}

