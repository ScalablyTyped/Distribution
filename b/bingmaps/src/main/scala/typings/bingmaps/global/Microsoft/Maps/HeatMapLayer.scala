package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IHeatMapLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.HeatMapLayer")
@js.native
class HeatMapLayer protected ()
  extends typings.bingmaps.Microsoft.Maps.HeatMapLayer {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Heatmap module.
    * @param locations Set of locations to visualize as a heat map.
    * @param options Options for customizing how the heat map is rendered.
    */
  def this(locations: js.Array[
        typings.bingmaps.Microsoft.Maps.Location | typings.bingmaps.Microsoft.Maps.Pushpin
      ]) = this()
  def this(
    locations: js.Array[
        typings.bingmaps.Microsoft.Maps.Location | typings.bingmaps.Microsoft.Maps.Pushpin
      ],
    options: IHeatMapLayerOptions
  ) = this()
}
