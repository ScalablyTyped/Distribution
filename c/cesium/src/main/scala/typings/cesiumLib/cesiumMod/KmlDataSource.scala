package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "KmlDataSource")
@js.native
class KmlDataSource () extends DataSource {
  def this(options: cesiumLib.Anon_Camera) = this()
  var refreshEvent: Event[js.Array[_]] = js.native
  var unsupportedNodeEvent: Event[js.Array[_]] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: java.lang.String): js.Promise[KmlDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Blob): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Blob, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Document): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Document, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
}

/* static members */
@JSImport("cesium", "KmlDataSource")
@js.native
object KmlDataSource extends js.Object {
  def load(data: cesiumLib.cesiumMod.Resource): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
  def load(data: cesiumLib.cesiumMod.Resource, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
  def load(data: java.lang.String): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
  def load(data: stdLib.Blob): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
  def load(data: stdLib.Blob, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
  def load(data: stdLib.Document): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
  def load(data: stdLib.Document, options: cesiumLib.Anon_CameraCanvas): js.Promise[cesiumLib.cesiumMod.KmlDataSource] = js.native
}

