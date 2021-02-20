package typings.cesium.mod

import typings.cesium.anon.ClampToGround
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeoJsonDataSource")
@js.native
class GeoJsonDataSource () extends DataSource {
  def this(name: String) = this()
  
  def load(data: String): js.Promise[GeoJsonDataSource] = js.native
  def load(data: String, options: ClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object, options: ClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource, options: ClampToGround): js.Promise[GeoJsonDataSource] = js.native
}
object GeoJsonDataSource {
  
  @JSImport("cesium", "GeoJsonDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.clampToGround")
  @js.native
  def clampToGround: Boolean = js.native
  @scala.inline
  def clampToGround_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.crsLinkHrefs")
  @js.native
  def crsLinkHrefs: js.Any = js.native
  @scala.inline
  def crsLinkHrefs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkHrefs")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.crsLinkTypes")
  @js.native
  def crsLinkTypes: js.Any = js.native
  @scala.inline
  def crsLinkTypes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkTypes")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.crsNames")
  @js.native
  def crsNames: js.Any = js.native
  @scala.inline
  def crsNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsNames")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.fill")
  @js.native
  def fill: Color = js.native
  @scala.inline
  def fill_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
  
  @JSImport("cesium", "GeoJsonDataSource.load")
  @js.native
  def load(data: String): js.Promise[GeoJsonDataSource] = js.native
  @JSImport("cesium", "GeoJsonDataSource.load")
  @js.native
  def load(data: String, options: ClampToGround): js.Promise[GeoJsonDataSource] = js.native
  @JSImport("cesium", "GeoJsonDataSource.load")
  @js.native
  def load(data: js.Object): js.Promise[GeoJsonDataSource] = js.native
  @JSImport("cesium", "GeoJsonDataSource.load")
  @js.native
  def load(data: js.Object, options: ClampToGround): js.Promise[GeoJsonDataSource] = js.native
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.load")
  @js.native
  def load(data: Resource): js.Promise[GeoJsonDataSource] = js.native
  @JSImport("cesium", "GeoJsonDataSource.load")
  @js.native
  def load(data: Resource, options: ClampToGround): js.Promise[GeoJsonDataSource] = js.native
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.markerColor")
  @js.native
  def markerColor: Color = js.native
  @scala.inline
  def markerColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.markerSize")
  @js.native
  def markerSize: Double = js.native
  @scala.inline
  def markerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.markerSymbol")
  @js.native
  def markerSymbol: String = js.native
  @scala.inline
  def markerSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.stroke")
  @js.native
  def stroke: Color = js.native
  
  /* static member */
  @JSImport("cesium", "GeoJsonDataSource.strokeWidth")
  @js.native
  def strokeWidth: Double = js.native
  @scala.inline
  def strokeWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def stroke_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
}
