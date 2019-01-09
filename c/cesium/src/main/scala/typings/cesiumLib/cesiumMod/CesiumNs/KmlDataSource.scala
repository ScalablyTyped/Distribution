package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlDataSource extends DataSource {
  var refreshEvent: Event = js.native
  var unsupportedNodeEvent: Event = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: java.lang.String): js.Promise[KmlDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Blob): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Blob, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Document): js.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Document, options: cesiumLib.Anon_ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
}

