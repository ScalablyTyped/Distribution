package typings.dc.mod

import typings.d3Geo.mod.GeoPath_
import typings.d3Geo.mod.GeoPermissibleObjects
import typings.d3Geo.mod.GeoProjection_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoChoroplethChart
  extends StObject
     with ColorMixin[GeoChoroplethChart]
     with BaseMixin[GeoChoroplethChart] {
  
  def geoJsons(): js.Array[GeoChoroplethLayer] = js.native
  
  def geoPath(): GeoPath_[Any, GeoPermissibleObjects] = js.native
  
  def overlayGeoJson(json: Any, name: String, keyAccessor: Accessor[Any, Any]): GeoChoroplethChart = js.native
  
  def projection(): GeoProjection_ = js.native
  def projection(t: GeoProjection_): GeoChoroplethChart = js.native
  @JSName("projection")
  var projection_Original: IGetSet[GeoProjection_, GeoChoroplethChart] = js.native
  
  def removeGeoJson(name: String): GeoChoroplethChart = js.native
}
