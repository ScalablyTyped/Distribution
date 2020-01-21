package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChoroplethChart
  extends ColorMixin[GeoChoroplethChart]
     with BaseMixin[GeoChoroplethChart] {
  @JSName("projection")
  var projection_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.geo.Projection */ _, 
    GeoChoroplethChart
  ] = js.native
  def geoJsons(): js.Array[GeoChoroplethLayer] = js.native
  def geoPath(): js.Any = js.native
  def overlayGeoJson(json: js.Any, name: String, keyAccessor: Accessor[_, _]): GeoChoroplethChart = js.native
  def projection(): js.Any = js.native
  def projection(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.geo.Projection */ js.Any
  ): GeoChoroplethChart = js.native
  def removeGeoJson(name: String): GeoChoroplethChart = js.native
}

