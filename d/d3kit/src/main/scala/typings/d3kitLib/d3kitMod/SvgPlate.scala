package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "SvgPlate")
@js.native
class SvgPlate () extends AbstractPlate {
  def this(options: ChartOptions) = this()
  var layers: LayerOrganizer = js.native
  var rootG: d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ] = js.native
}

/* static members */
@JSImport("d3kit", "SvgPlate")
@js.native
object SvgPlate extends js.Object {
  def getDefaultOptions(): d3kitLib.d3kitMod.ChartOptions = js.native
  def getDefaultOptions(options: d3kitLib.d3kitMod.ChartOptions): d3kitLib.d3kitMod.ChartOptions = js.native
}

