package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CzmlDataSource")
@js.native
class CzmlDataSource ()
  extends cesiumLib.cesiumMod.CesiumNs.CzmlDataSource {
  def this(name: java.lang.String) = this()
  /* CompleteClass */
  override var changedEvent: cesiumLib.cesiumMod.CesiumNs.Event[js.Array[_]] = js.native
  /* CompleteClass */
  override var clock: cesiumLib.cesiumMod.CesiumNs.DataSourceClock = js.native
  /* CompleteClass */
  override var clustering: cesiumLib.cesiumMod.CesiumNs.EntityCluster = js.native
  /* CompleteClass */
  override var entities: cesiumLib.cesiumMod.CesiumNs.EntityCollection = js.native
  /* CompleteClass */
  override var errorEvent: cesiumLib.cesiumMod.CesiumNs.Event[js.Array[_]] = js.native
  /* CompleteClass */
  override var isLoading: scala.Boolean = js.native
  /* CompleteClass */
  override var loadingEvent: cesiumLib.cesiumMod.CesiumNs.Event[js.Array[_]] = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override def update(time: cesiumLib.cesiumMod.CesiumNs.JulianDate): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "CzmlDataSource")
@js.native
object CzmlDataSource extends js.Object {
  var updaters: js.Array[_] = js.native
  def load(czml: cesiumLib.cesiumMod.CesiumNs.Resource): js.Promise[cesiumLib.cesiumMod.CesiumNs.CzmlDataSource] = js.native
  def load(czml: cesiumLib.cesiumMod.CesiumNs.Resource, options: cesiumLib.Anon_SourceUri): js.Promise[cesiumLib.cesiumMod.CesiumNs.CzmlDataSource] = js.native
  def load(czml: java.lang.String): js.Promise[cesiumLib.cesiumMod.CesiumNs.CzmlDataSource] = js.native
  def load(czml: java.lang.String, options: cesiumLib.Anon_SourceUri): js.Promise[cesiumLib.cesiumMod.CesiumNs.CzmlDataSource] = js.native
  def load(czml: js.Object): js.Promise[cesiumLib.cesiumMod.CesiumNs.CzmlDataSource] = js.native
  def load(czml: js.Object, options: cesiumLib.Anon_SourceUri): js.Promise[cesiumLib.cesiumMod.CesiumNs.CzmlDataSource] = js.native
  def processMaterialPacketData(
    `object`: js.Object,
    propertyName: java.lang.String,
    packetData: js.Object,
    interval: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    sourceUri: java.lang.String,
    entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection
  ): scala.Unit = js.native
  def processPacketData(
    `type`: js.Function0[_],
    `object`: js.Object,
    propertyName: java.lang.String,
    packetData: js.Object,
    interval: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    sourceUri: java.lang.String,
    entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection
  ): scala.Unit = js.native
  def processPositionPacketData(
    `object`: js.Object,
    propertyName: java.lang.String,
    packetData: js.Object,
    interval: cesiumLib.cesiumMod.CesiumNs.TimeInterval,
    sourceUri: java.lang.String,
    entityCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection
  ): scala.Unit = js.native
}

