package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityCollection extends js.Object {
  val collectionChanged: Event[js.Array[_]]
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
    add: Entity => Entity,
    collectionChanged: Event[js.Array[_]],
    computeAvailability: () => TimeInterval,
    contains: Entity => scala.Boolean,
    getById: java.lang.String => Entity,
    getOrCreateEntity: java.lang.String => Entity,
    id: java.lang.String,
    owner: DataSource | CompositeEntityCollection,
    remove: Entity => scala.Boolean,
    removeAll: () => scala.Unit,
    removeById: java.lang.String => scala.Boolean,
    resumeEvents: () => scala.Unit,
    show: scala.Boolean,
    suspendEvents: () => scala.Unit,
    values: js.Array[Entity]
  ): EntityCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), collectionChanged = collectionChanged, computeAvailability = js.Any.fromFunction0(computeAvailability), contains = js.Any.fromFunction1(contains), getById = js.Any.fromFunction1(getById), getOrCreateEntity = js.Any.fromFunction1(getOrCreateEntity), id = id, owner = owner.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), removeById = js.Any.fromFunction1(removeById), resumeEvents = js.Any.fromFunction0(resumeEvents), show = show, suspendEvents = js.Any.fromFunction0(suspendEvents), values = values)
  
    __obj.asInstanceOf[EntityCollection]
  }
}

