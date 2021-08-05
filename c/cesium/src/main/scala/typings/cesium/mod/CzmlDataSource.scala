package typings.cesium.mod

import typings.cesium.anon.SourceUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def load(czml: String): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: String, options: SourceUri): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: js.Object): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: js.Object, options: SourceUri): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
  /* static member */
  inline def load(czml: Resource): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: Resource, options: SourceUri): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
  
  /* static member */
  inline def processMaterialPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processMaterialPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def processPacketData(
    `type`: js.Function0[js.Any],
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPacketData")(`type`.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def processPositionPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPositionPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("cesium", "CzmlDataSource.updaters")
  @js.native
  def updaters: js.Array[js.Any] = js.native
  inline def updaters_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updaters")(x.asInstanceOf[js.Any])
}
