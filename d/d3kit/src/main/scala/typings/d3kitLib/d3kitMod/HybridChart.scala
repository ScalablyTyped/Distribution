package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "HybridChart")
@js.native
class HybridChart protected () extends CanvasChart {
  def this(selector: java.lang.String) = this()
  def this(selector: stdLib.Element) = this()
  def this(selector: java.lang.String, options: ChartOptions) = this()
  def this(selector: stdLib.Element, options: ChartOptions) = this()
  var layers: LayerOrganizer = js.native
  var plate: SvgPlate = js.native
  var rootG: d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ] = js.native
  var svg: d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ] = js.native
}

@JSImport("d3kit", "HybridChart")
@js.native
object HybridChart extends js.Object {
  def getDefaultOptions(): d3kitLib.d3kitMod.ChartOptions = js.native
}

