package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPolygonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.Polygon")
@js.native
class Polygon protected ()
  extends typings.bingmaps.Microsoft.Maps.Polygon {
  /**
    * @constructor
    * @param rings A Location array for basic polygon with single outer perimeter,
    * or an array of Location arrays for advanced polygon (multi-polygon, polygon with holes, or combination of polygons).
    * @param options Options used to customize polygon.
    */
  def this(rings: js.Array[
        js.Array[typings.bingmaps.Microsoft.Maps.Location] | typings.bingmaps.Microsoft.Maps.Location
      ]) = this()
  def this(
    rings: js.Array[
        js.Array[typings.bingmaps.Microsoft.Maps.Location] | typings.bingmaps.Microsoft.Maps.Location
      ],
    options: IPolygonOptions
  ) = this()
}
