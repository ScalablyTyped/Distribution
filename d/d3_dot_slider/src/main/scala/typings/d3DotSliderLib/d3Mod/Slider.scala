package typings
package d3DotSliderLib.d3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends js.Object {
  def apply(
    sel: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ): scala.Unit = js.native
  def animate(): scala.Boolean | scala.Double = js.native
  def animate(`val`: scala.Boolean): Slider = js.native
  def animate(`val`: scala.Double): Slider = js.native
  def axis(): scala.Boolean | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any) = js.native
  def axis(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any
  ): Slider = js.native
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

