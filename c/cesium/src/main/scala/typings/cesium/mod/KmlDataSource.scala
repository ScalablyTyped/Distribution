package typings.cesium.mod

import typings.cesium.AnonCamera
import typings.cesium.AnonCanvas
import typings.cesium.AnonClampToGroundEllipsoid
import typings.std.Blob
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "KmlDataSource")
@js.native
class KmlDataSource () extends DataSource {
  def this(options: AnonCamera) = this()
  var refreshEvent: Event[js.Array[_]] = js.native
  var unsupportedNodeEvent: Event[js.Array[_]] = js.native
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: AnonClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: AnonClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: AnonClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Document_): js.Promise[KmlDataSource] = js.native
  def load(data: Document_, options: AnonClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
}

/* static members */
@JSImport("cesium", "KmlDataSource")
@js.native
object KmlDataSource extends js.Object {
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: AnonCanvas): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: AnonCanvas): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: AnonCanvas): js.Promise[KmlDataSource] = js.native
  def load(data: Document_): js.Promise[KmlDataSource] = js.native
  def load(data: Document_, options: AnonCanvas): js.Promise[KmlDataSource] = js.native
}

