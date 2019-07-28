package typings.d3kit.d3kitMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "AbstractChart")
@js.native
class AbstractChart protected () extends Base {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: ChartOptions) = this()
  def this(selector: Element, options: ChartOptions) = this()
  def addPlate(name: String, plate: AbstractPlate): this.type = js.native
  def addPlate(name: String, plate: AbstractPlate, doNotAppend: Boolean): AbstractPlate = js.native
  def data(): js.Any = js.native
  def data(data: js.Any): this.type = js.native
  def destroy(): this.type = js.native
  def dispatchAs(name: String, args: js.Any*): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def fit(): this.type = js.native
  def fit(fitOptions: FitOptions): this.type = js.native
  def fit(fitOptions: FitOptions, watchOptions: Boolean): this.type = js.native
  def fit(fitOptions: FitOptions, watchOptions: WatchOptions): this.type = js.native
  def getCustomEventNames(): js.Array[String] = js.native
  def getInnerHeight(): Double = js.native
  def getInnerWidth(): Double = js.native
  def hasData(): Boolean = js.native
  def hasNonZeroArea(): Boolean = js.native
  def off(name: String): this.type = js.native
  def on(name: String, listener: js.Function0[Unit]): this.type = js.native
  def options(): ChartOptions = js.native
  def options(options: ChartOptions): this.type = js.native
  def removePlate(name: String): this.type = js.native
  def setupDispatcher(): this.type = js.native
  def setupDispatcher(customEventNames: js.Array[String]): this.type = js.native
  def stopFitWatcher(): this.type = js.native
}

/* static members */
@JSImport("d3kit", "AbstractChart")
@js.native
object AbstractChart extends js.Object {
  def getCustomEventNames(): js.Array[String] = js.native
}

