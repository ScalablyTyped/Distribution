package typings.cesium.global.Cesium

import typings.cesium.anon.Canvas
import typings.std.Blob
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.KmlDataSource")
@js.native
class KmlDataSource ()
  extends typings.cesium.mod.KmlDataSource {
  def this(options: typings.cesium.anon.Camera) = this()
}
object KmlDataSource {
  
  @JSGlobal("Cesium.KmlDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(data: String): js.Promise[typings.cesium.mod.KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
  inline def load(data: String, options: Canvas): js.Promise[typings.cesium.mod.KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
  /* static member */
  inline def load(data: typings.cesium.mod.Resource): js.Promise[typings.cesium.mod.KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
  inline def load(data: typings.cesium.mod.Resource, options: Canvas): js.Promise[typings.cesium.mod.KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
  inline def load(data: Blob): js.Promise[typings.cesium.mod.KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
  inline def load(data: Blob, options: Canvas): js.Promise[typings.cesium.mod.KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
  inline def load(data: Document): js.Promise[typings.cesium.mod.KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
  inline def load(data: Document, options: Canvas): js.Promise[typings.cesium.mod.KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.KmlDataSource]]
}
