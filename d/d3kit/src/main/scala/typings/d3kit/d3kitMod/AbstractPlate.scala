package typings.d3kit.d3kitMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "AbstractPlate")
@js.native
class AbstractPlate protected () extends Base {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: ChartOptions) = this()
  def this(selector: Element, options: ChartOptions) = this()
  def getNode(): Element = js.native
  def getSelection(): Selection[BaseType, _, BaseType, _] = js.native
}

/* static members */
@JSImport("d3kit", "AbstractPlate")
@js.native
object AbstractPlate extends js.Object {
  def getDefaultOptions(): ChartOptions = js.native
  def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
}

