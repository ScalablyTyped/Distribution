package typings.cesium.global.Cesium

import typings.cesium.anon.ClampToGround
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.GeoJsonDataSource")
@js.native
class GeoJsonDataSource ()
  extends typings.cesium.mod.GeoJsonDataSource {
  def this(name: String) = this()
}
object GeoJsonDataSource {
  
  @JSGlobal("Cesium.GeoJsonDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.clampToGround")
  @js.native
  def clampToGround: Boolean = js.native
  inline def clampToGround_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.crsLinkHrefs")
  @js.native
  def crsLinkHrefs: js.Any = js.native
  inline def crsLinkHrefs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkHrefs")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.crsLinkTypes")
  @js.native
  def crsLinkTypes: js.Any = js.native
  inline def crsLinkTypes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkTypes")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.crsNames")
  @js.native
  def crsNames: js.Any = js.native
  inline def crsNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsNames")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.fill")
  @js.native
  def fill: typings.cesium.mod.Color = js.native
  inline def fill_=(x: typings.cesium.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
  
  inline def load(data: String): js.Promise[typings.cesium.mod.GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.GeoJsonDataSource]]
  inline def load(data: String, options: ClampToGround): js.Promise[typings.cesium.mod.GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.GeoJsonDataSource]]
  inline def load(data: js.Object): js.Promise[typings.cesium.mod.GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.GeoJsonDataSource]]
  inline def load(data: js.Object, options: ClampToGround): js.Promise[typings.cesium.mod.GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.GeoJsonDataSource]]
  /* static member */
  inline def load(data: typings.cesium.mod.Resource): js.Promise[typings.cesium.mod.GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.GeoJsonDataSource]]
  inline def load(data: typings.cesium.mod.Resource, options: ClampToGround): js.Promise[typings.cesium.mod.GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.GeoJsonDataSource]]
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.markerColor")
  @js.native
  def markerColor: typings.cesium.mod.Color = js.native
  inline def markerColor_=(x: typings.cesium.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.markerSize")
  @js.native
  def markerSize: Double = js.native
  inline def markerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.markerSymbol")
  @js.native
  def markerSymbol: String = js.native
  inline def markerSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.stroke")
  @js.native
  def stroke: typings.cesium.mod.Color = js.native
  
  /* static member */
  @JSGlobal("Cesium.GeoJsonDataSource.strokeWidth")
  @js.native
  def strokeWidth: Double = js.native
  inline def strokeWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(x.asInstanceOf[js.Any])
  
  inline def stroke_=(x: typings.cesium.mod.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
}
