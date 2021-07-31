package typings.cesium.mod

import typings.cesium.anon.Canvas
import typings.cesium.anon.ClampToGroundEllipsoid
import typings.std.Blob
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "KmlDataSource")
@js.native
class KmlDataSource () extends DataSource {
  def this(options: typings.cesium.anon.Camera) = this()
  
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  def load(data: Document, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  
  var refreshEvent: Event[js.Array[js.Any]] = js.native
  
  var unsupportedNodeEvent: Event[js.Array[js.Any]] = js.native
}
object KmlDataSource {
  
  @JSImport("cesium", "KmlDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(data: String): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  @scala.inline
  def load(data: String, options: Canvas): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  /* static member */
  @scala.inline
  def load(data: Resource): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  @scala.inline
  def load(data: Resource, options: Canvas): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  @scala.inline
  def load(data: Blob): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  @scala.inline
  def load(data: Blob, options: Canvas): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  @scala.inline
  def load(data: Document): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  @scala.inline
  def load(data: Document, options: Canvas): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
}
