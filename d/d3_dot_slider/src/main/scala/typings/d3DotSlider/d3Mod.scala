package typings.d3DotSlider

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.d3DotSlider.d3DotSliderStrings.slide
import typings.d3DotSlider.d3DotSliderStrings.slideend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("d3", JSImport.Namespace)
@js.native
object d3Mod extends js.Object {
  @js.native
  trait Slider extends js.Object {
    def apply(
      sel: Selection[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
        ]
    ): Unit = js.native
    def animate(): Boolean | Double = js.native
    def animate(`val`: Boolean): Slider = js.native
    def animate(`val`: Double): Slider = js.native
    def axis(): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any) = js.native
    def axis(
      `val`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any
    ): Slider = js.native
    def axis(`val`: Boolean): Slider = js.native
    def margin(): Double = js.native
    def margin(`val`: Double): Slider = js.native
    def max(): Double = js.native
    def max(`val`: Double): Slider = js.native
    def min(): Double = js.native
    def min(`val`: Double): Slider = js.native
    @JSName("on")
    def on_slide(evt: slide, callback: js.Function2[/* evt */ js.Any, /* val */ js.Any, Unit]): Slider = js.native
    @JSName("on")
    def on_slideend(evt: slideend, callback: js.Function2[/* evt */ js.Any, /* val */ js.Any, Unit]): Slider = js.native
    def orientation(): String = js.native
    def orientation(`val`: String): Slider = js.native
    def scale(): js.Any = js.native
    def scale(`val`: js.Any): Slider = js.native
    def snap(): Boolean = js.native
    def snap(`val`: Boolean): Slider = js.native
    def step(): Double = js.native
    def step(`val`: Double): Slider = js.native
    def value(): js.Any = js.native
    def value(`val`: js.Any): Slider = js.native
  }
  
  def slider(): Slider = js.native
}

