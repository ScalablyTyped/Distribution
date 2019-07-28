package typings.cesium.cesiumMod

import typings.cesium.Anon_Camera
import typings.cesium.Anon_CameraCanvas
import typings.cesium.Anon_ClampToGroundEllipsoid
import typings.std.Blob
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "KmlDataSource")
@js.native
class KmlDataSource () extends DataSource {
  def this(options: Anon_Camera) = this()
  var refreshEvent: Event[js.Array[_]] = js.native
  var unsupportedNodeEvent: Event[js.Array[_]] = js.native
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  def load(data: Document, options: Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
}

/* static members */
@JSImport("cesium", "KmlDataSource")
@js.native
object KmlDataSource extends js.Object {
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: Anon_CameraCanvas): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: Anon_CameraCanvas): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: Anon_CameraCanvas): js.Promise[KmlDataSource] = js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  def load(data: Document, options: Anon_CameraCanvas): js.Promise[KmlDataSource] = js.native
}

