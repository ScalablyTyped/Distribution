package typings.cesium.mod

import typings.cesium.anon.SourceUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CzmlDataSource")
@js.native
class CzmlDataSource () extends DataSource {
  def this(name: String) = this()
  
  def load(czml: String): js.Promise[CzmlDataSource] = js.native
  def load(czml: String, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  
  def process(czml: String): js.Promise[CzmlDataSource] = js.native
  def process(czml: String, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def process(czml: js.Object, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def process(czml: Resource, options: SourceUri): js.Promise[CzmlDataSource] = js.native
}
/* static members */
@JSImport("cesium", "CzmlDataSource")
@js.native
object CzmlDataSource extends js.Object {
  
  def load(czml: String): js.Promise[CzmlDataSource] = js.native
  def load(czml: String, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  
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
  
  var updaters: js.Array[_] = js.native
}
