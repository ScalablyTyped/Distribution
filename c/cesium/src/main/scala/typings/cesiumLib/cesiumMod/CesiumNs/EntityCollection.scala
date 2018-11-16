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

