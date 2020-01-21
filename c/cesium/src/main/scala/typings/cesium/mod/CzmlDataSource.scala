package typings.cesium.mod

import typings.cesium.AnonSourceUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CzmlDataSource")
@js.native
class CzmlDataSource () extends DataSource {
  def this(name: String) = this()
  def load(czml: String): js.Promise[CzmlDataSource] = js.native
  def load(czml: String, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: String): js.Promise[CzmlDataSource] = js.native
  def process(czml: String, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def process(czml: js.Object, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def process(czml: Resource, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
}

/* static members */
@JSImport("cesium", "CzmlDataSource")
@js.native
object CzmlDataSource extends js.Object {
  var updaters: js.Array[_] = js.native
  def load(czml: String): js.Promise[CzmlDataSource] = js.native
  def load(czml: String, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource, options: AnonSourceUri): js.Promise[CzmlDataSource] = js.native
  def processMaterialPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = js.native
  def processPacketData(
    `type`: js.Function0[_],
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = js.native
  def processPositionPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = js.native
}

