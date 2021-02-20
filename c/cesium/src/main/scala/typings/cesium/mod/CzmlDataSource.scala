package typings.cesium.mod

import typings.cesium.anon.SourceUri
import org.scalablytyped.runtime.StObject
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
object CzmlDataSource {
  
  @JSImport("cesium", "CzmlDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cesium", "CzmlDataSource.load")
  @js.native
  def load(czml: String): js.Promise[CzmlDataSource] = js.native
  @JSImport("cesium", "CzmlDataSource.load")
  @js.native
  def load(czml: String, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  @JSImport("cesium", "CzmlDataSource.load")
  @js.native
  def load(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  @JSImport("cesium", "CzmlDataSource.load")
  @js.native
  def load(czml: js.Object, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  /* static member */
  @JSImport("cesium", "CzmlDataSource.load")
  @js.native
  def load(czml: Resource): js.Promise[CzmlDataSource] = js.native
  @JSImport("cesium", "CzmlDataSource.load")
  @js.native
  def load(czml: Resource, options: SourceUri): js.Promise[CzmlDataSource] = js.native
  
  /* static member */
  @JSImport("cesium", "CzmlDataSource.processMaterialPacketData")
  @js.native
  def processMaterialPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = js.native
  
  /* static member */
  @JSImport("cesium", "CzmlDataSource.processPacketData")
  @js.native
  def processPacketData(
    `type`: js.Function0[_],
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = js.native
  
  /* static member */
  @JSImport("cesium", "CzmlDataSource.processPositionPacketData")
  @js.native
  def processPositionPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = js.native
  
  /* static member */
  @JSImport("cesium", "CzmlDataSource.updaters")
  @js.native
  def updaters: js.Array[js.Any] = js.native
  @scala.inline
  def updaters_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updaters")(x.asInstanceOf[js.Any])
}
