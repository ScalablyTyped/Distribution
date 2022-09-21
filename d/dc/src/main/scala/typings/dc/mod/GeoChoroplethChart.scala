package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoChoroplethChart
  extends StObject
     with ColorMixin[GeoChoroplethChart]
     with BaseMixin[GeoChoroplethChart] {
  
  def geoJsons(): js.Array[GeoChoroplethLayer] = js.native
  
  def geoPath(): Any = js.native
  
  def overlayGeoJson(json: Any, name: String, keyAccessor: Accessor[Any, Any]): GeoChoroplethChart = js.native
  
  def projection(): Any = js.native
  def projection(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.geo.Projection */ Any
  ): GeoChoroplethChart = js.native
  @JSName("projection")
  var projection_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.geo.Projection */ Any, 
    GeoChoroplethChart
  ] = js.native
  
  def removeGeoJson(name: String): GeoChoroplethChart = js.native
}
