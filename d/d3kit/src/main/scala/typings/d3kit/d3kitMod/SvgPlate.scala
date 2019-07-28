package typings.d3kit.d3kitMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "SvgPlate")
@js.native
class SvgPlate () extends AbstractPlate {
  def this(options: ChartOptions) = this()
  var layers: LayerOrganizer = js.native
  var rootG: Selection[BaseType, _, BaseType, _] = js.native
}

/* static members */
@JSImport("d3kit", "SvgPlate")
@js.native
object SvgPlate extends js.Object {
  def getDefaultOptions(): ChartOptions = js.native
  def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
}

