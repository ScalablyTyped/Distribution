package typings.cesium.mod

import typings.cesium.anon.Canvas
import typings.cesium.anon.ClampToGroundEllipsoid
import typings.std.Blob
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "KmlDataSource")
@js.native
class KmlDataSource () extends DataSource {
  def this(options: typings.cesium.anon.Camera) = this()
  var refreshEvent: Event[js.Array[_]] = js.native
  var unsupportedNodeEvent: Event[js.Array[_]] = js.native
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  def load(data: Document, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
}

/* static members */
@JSImport("cesium", "KmlDataSource")
@js.native
object KmlDataSource extends js.Object {
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: Canvas): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: Canvas): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: Canvas): js.Promise[KmlDataSource] = js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  def load(data: Document, options: Canvas): js.Promise[KmlDataSource] = js.native
}

