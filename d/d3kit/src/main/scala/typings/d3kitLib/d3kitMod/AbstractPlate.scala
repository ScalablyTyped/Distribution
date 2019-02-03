package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "AbstractPlate")
@js.native
class AbstractPlate protected () extends Base {
  def this(selector: java.lang.String) = this()
  def this(selector: stdLib.Element) = this()
  def this(selector: java.lang.String, options: ChartOptions) = this()
  def this(selector: stdLib.Element, options: ChartOptions) = this()
  def getNode(): stdLib.Element = js.native
  def getSelection(): d3DashSelectionLib.d3DashSelectionMod.Selection[
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    _
  ] = js.native
}

/* static members */
@JSImport("d3kit", "AbstractPlate")
@js.native
object AbstractPlate extends js.Object {
  def getDefaultOptions(): d3kitLib.d3kitMod.ChartOptions = js.native
  def getDefaultOptions(options: d3kitLib.d3kitMod.ChartOptions): d3kitLib.d3kitMod.ChartOptions = js.native
}

