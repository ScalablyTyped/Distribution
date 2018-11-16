package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "AbstractChart")
@js.native
class AbstractChart protected () extends Base {
  def this(selector: java.lang.String) = this()
  def this(selector: stdLib.Element) = this()
  def this(selector: java.lang.String, options: ChartOptions) = this()
  def this(selector: stdLib.Element, options: ChartOptions) = this()
  def addPlate(name: java.lang.String, plate: AbstractPlate): this.type = js.native
  def addPlate(name: java.lang.String, plate: AbstractPlate, doNotAppend: scala.Boolean): AbstractPlate = js.native
  def data(): js.Any = js.native
  def data(data: js.Any): this.type = js.native
  def destroy(): this.type = js.native
  def dispatchAs(name: java.lang.String, args: js.Any*): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def fit(): this.type = js.native
  def fit(fitOptions: FitOptions): this.type = js.native
  def fit(fitOptions: FitOptions, watchOptions: WatchOptions): this.type = js.native
  def fit(fitOptions: FitOptions, watchOptions: scala.Boolean): this.type = js.native
  def getCustomEventNames(): js.Array[java.lang.String] = js.native
  def getInnerHeight(): scala.Double = js.native
  def getInnerWidth(): scala.Double = js.native
  def hasData(): scala.Boolean = js.native
  def hasNonZeroArea(): scala.Boolean = js.native
  def off(name: java.lang.String): this.type = js.native
  def on(name: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  def options(): ChartOptions = js.native
  def options(options: ChartOptions): this.type = js.native
  def removePlate(name: java.lang.String): this.type = js.native
  def setupDispatcher(): this.type = js.native
  def setupDispatcher(customEventNames: js.Array[java.lang.String]): this.type = js.native
  def stopFitWatcher(): this.type = js.native
}

@JSImport("d3kit", "AbstractChart")
@js.native
object AbstractChart extends js.Object {
  def getCustomEventNames(): js.Array[java.lang.String] = js.native
}

