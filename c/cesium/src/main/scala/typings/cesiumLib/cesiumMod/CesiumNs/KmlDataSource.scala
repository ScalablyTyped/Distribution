package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlDataSource extends DataSource {
  var refreshEvent: Event = js.native
  var unsupportedNodeEvent: Event = js.native
  def load(data: Resource): stdLib.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: cesiumLib.Anon_SourceUriEllipsoid): stdLib.Promise[KmlDataSource] = js.native
  def load(data: java.lang.String): stdLib.Promise[KmlDataSource] = js.native
  def load(data: java.lang.String, options: cesiumLib.Anon_SourceUriEllipsoid): stdLib.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Blob): stdLib.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Blob, options: cesiumLib.Anon_SourceUriEllipsoid): stdLib.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Document): stdLib.Promise[KmlDataSource] = js.native
  def load(data: stdLib.Document, options: cesiumLib.Anon_SourceUriEllipsoid): stdLib.Promise[KmlDataSource] = js.native
}

