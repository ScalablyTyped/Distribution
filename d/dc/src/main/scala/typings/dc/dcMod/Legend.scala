package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Legend extends js.Object {
  @JSName("autoItemWidth")
  var autoItemWidth_Original: IGetSet[Boolean, Legend] = js.native
  @JSName("gap")
  var gap_Original: IGetSet[Double, Legend] = js.native
  @JSName("horizontal")
  var horizontal_Original: IGetSet[Boolean, Legend] = js.native
  @JSName("itemHeight")
  var itemHeight_Original: IGetSet[Double, Legend] = js.native
  @JSName("itemWidth")
  var itemWidth_Original: IGetSet[Double, Legend] = js.native
  @JSName("legendText")
  var legendText_Original: IGetSet[_, Legend] = js.native
  @JSName("legendWidth")
  var legendWidth_Original: IGetSet[Double, Legend] = js.native
  @JSName("x")
  var x_Original: IGetSet[Double, Legend] = js.native
  @JSName("y")
  var y_Original: IGetSet[Double, Legend] = js.native
  def autoItemWidth(): Boolean = js.native
  def autoItemWidth(t: Boolean): Legend = js.native
  def gap(): Double = js.native
  def gap(t: Double): Legend = js.native
  def horizontal(): Boolean = js.native
  def horizontal(t: Boolean): Legend = js.native
  def itemHeight(): Double = js.native
  def itemHeight(t: Double): Legend = js.native
  def itemWidth(): Double = js.native
  def itemWidth(t: Double): Legend = js.native
  def legendText(): js.Any = js.native
  def legendText(t: js.Any): Legend = js.native
  def legendWidth(): Double = js.native
  def legendWidth(t: Double): Legend = js.native
  def render(): Unit = js.native
  def x(): Double = js.native
  def x(t: Double): Legend = js.native
  def y(): Double = js.native
  def y(t: Double): Legend = js.native
}

