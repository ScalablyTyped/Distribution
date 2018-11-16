package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChoroplethChart
  extends ColorMixin[GeoChoroplethChart]
     with BaseMixin[GeoChoroplethChart] {
  @JSName("projection")
  var projection_Original: IGetSet[_, GeoChoroplethChart] = js.native
  def geoJsons(): js.Array[GeoChoroplethLayer] = js.native
  def geoPath(): js.Any = js.native
  def overlayGeoJson(json: js.Any, name: java.lang.String, keyAccessor: Accessor[_, _]): scala.Unit = js.native
  def projection(): js.Any = js.native
  def projection(t: js.Any): GeoChoroplethChart = js.native
  def removeGeoJson(name: java.lang.String): scala.Unit = js.native
}

