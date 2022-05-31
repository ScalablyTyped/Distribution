package typings.cesium.global.Cesium

import typings.cesium.anon.SourceUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.CzmlDataSource")
@js.native
class CzmlDataSource ()
  extends typings.cesium.mod.CzmlDataSource {
  def this(name: String) = this()
}
object CzmlDataSource {
  
  @JSGlobal("Cesium.CzmlDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(czml: String): js.Promise[typings.cesium.mod.CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.CzmlDataSource]]
  inline def load(czml: String, options: SourceUri): js.Promise[typings.cesium.mod.CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.CzmlDataSource]]
  inline def load(czml: js.Object): js.Promise[typings.cesium.mod.CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.CzmlDataSource]]
  inline def load(czml: js.Object, options: SourceUri): js.Promise[typings.cesium.mod.CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.CzmlDataSource]]
  /* static member */
  inline def load(czml: typings.cesium.mod.Resource): js.Promise[typings.cesium.mod.CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.CzmlDataSource]]
  inline def load(czml: typings.cesium.mod.Resource, options: SourceUri): js.Promise[typings.cesium.mod.CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.CzmlDataSource]]
  
  /* static member */
  inline def processMaterialPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: typings.cesium.mod.TimeInterval,
    sourceUri: String,
    entityCollection: typings.cesium.mod.EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processMaterialPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def processPacketData(
    `type`: js.Function0[js.Any],
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: typings.cesium.mod.TimeInterval,
    sourceUri: String,
    entityCollection: typings.cesium.mod.EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPacketData")(`type`.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def processPositionPacketData(
    `object`: js.Object,
    propertyName: String,
    packetData: js.Object,
    interval: typings.cesium.mod.TimeInterval,
    sourceUri: String,
    entityCollection: typings.cesium.mod.EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPositionPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @JSGlobal("Cesium.CzmlDataSource.updaters")
  @js.native
  def updaters: js.Array[js.Any] = js.native
  inline def updaters_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updaters")(x.asInstanceOf[js.Any])
}
