package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CzmlDataSource")
@js.native
class CzmlDataSource () extends DataSource {
  def this(name: java.lang.String) = this()
  def load(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource, options: cesiumLib.Anon_SourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: java.lang.String): js.Promise[CzmlDataSource] = js.native
  def load(czml: java.lang.String, options: cesiumLib.Anon_SourceUri): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def load(czml: js.Object, options: cesiumLib.Anon_SourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def process(czml: Resource, options: cesiumLib.Anon_SourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: java.lang.String): js.Promise[CzmlDataSource] = js.native
  def process(czml: java.lang.String, options: cesiumLib.Anon_SourceUri): js.Promise[CzmlDataSource] = js.native
  def process(czml: js.Object): js.Promise[CzmlDataSource] = js.native
  def process(czml: js.Object, options: cesiumLib.Anon_SourceUri): js.Promise[CzmlDataSource] = js.native
}

/* static members */
@JSImport("cesium", "CzmlDataSource")
@js.native
object CzmlDataSource extends js.Object {
  var updaters: js.Array[_] = js.native
  def load(czml: cesiumLib.cesiumMod.Resource): js.Promise[cesiumLib.cesiumMod.CzmlDataSource] = js.native
  def load(czml: cesiumLib.cesiumMod.Resource, options: cesiumLib.Anon_SourceUri): js.Promise[cesiumLib.cesiumMod.CzmlDataSource] = js.native
  def load(czml: java.lang.String): js.Promise[cesiumLib.cesiumMod.CzmlDataSource] = js.native
  def load(czml: java.lang.String, options: cesiumLib.Anon_SourceUri): js.Promise[cesiumLib.cesiumMod.CzmlDataSource] = js.native
  def load(czml: js.Object): js.Promise[cesiumLib.cesiumMod.CzmlDataSource] = js.native
  def load(czml: js.Object, options: cesiumLib.Anon_SourceUri): js.Promise[cesiumLib.cesiumMod.CzmlDataSource] = js.native
  def processMaterialPacketData(
    `object`: js.Object,
    propertyName: java.lang.String,
    packetData: js.Object,
    interval: cesiumLib.cesiumMod.TimeInterval,
    sourceUri: java.lang.String,
    entityCollection: cesiumLib.cesiumMod.EntityCollection
  ): scala.Unit = js.native
  def processPacketData(
    `type`: js.Function0[_],
    `object`: js.Object,
    propertyName: java.lang.String,
    packetData: js.Object,
    interval: cesiumLib.cesiumMod.TimeInterval,
    sourceUri: java.lang.String,
    entityCollection: cesiumLib.cesiumMod.EntityCollection
  ): scala.Unit = js.native
  def processPositionPacketData(
    `object`: js.Object,
    propertyName: java.lang.String,
    packetData: js.Object,
    interval: cesiumLib.cesiumMod.TimeInterval,
    sourceUri: java.lang.String,
    entityCollection: cesiumLib.cesiumMod.EntityCollection
  ): scala.Unit = js.native
}

