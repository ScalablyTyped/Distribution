package typings
package d3DotSliderLib.d3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends js.Object {
  def apply(sel: d3DashSelectionLib.d3DashSelectionMod.Selection[_, js.Object, js.Object, js.Object]): scala.Unit = js.native
  def animate(): scala.Boolean | scala.Double = js.native
  def animate(`val`: scala.Boolean): Slider = js.native
  def animate(`val`: scala.Double): Slider = js.native
  def axis(): scala.Boolean | js.Any = js.native
  def axis(`val`: js.Any): Slider = js.native
  def axis(`val`: scala.Boolean): Slider = js.native
  def margin(): scala.Double = js.native
  def margin(`val`: scala.Double): Slider = js.native
  def max(): scala.Double = js.native
  def max(`val`: scala.Double): Slider = js.native
  def min(): scala.Double = js.native
  def min(`val`: scala.Double): Slider = js.native
  @JSName("on")
  def on_slide(
    evt: d3DotSliderLib.d3DotSliderLibStrings.slide,
    callback: js.Function2[/* evt */ js.Any, /* val */ js.Any, scala.Unit]
  ): Slider = js.native
  @JSName("on")
  def on_slideend(
    evt: d3DotSliderLib.d3DotSliderLibStrings.slideend,
    callback: js.Function2[/* evt */ js.Any, /* val */ js.Any, scala.Unit]
  ): Slider = js.native
  def orientation(): java.lang.String = js.native
  def orientation(`val`: java.lang.String): Slider = js.native
  def scale(): js.Any = js.native
  def scale(`val`: js.Any): Slider = js.native
  def snap(): scala.Boolean = js.native
  def snap(`val`: scala.Boolean): Slider = js.native
  def step(): scala.Double = js.native
  def step(`val`: scala.Double): Slider = js.native
  def value(): js.Any = js.native
  def value(`val`: js.Any): Slider = js.native
}

