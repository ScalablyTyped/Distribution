package typings.d3Slider

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Slider.d3SliderStrings.slide
import typings.d3Slider.d3SliderStrings.slideend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object d3Mod {
  
  @JSImport("d3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def slider(): Slider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("slider")().asInstanceOf[Slider_]
  
  @js.native
  trait Slider_ extends StObject {
    
    def apply(
      sel: Selection_[
          Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
        ]
    ): Unit = js.native
    
    def animate(): Boolean | Double = js.native
    def animate(`val`: Boolean): Slider_ = js.native
    def animate(`val`: Double): Slider_ = js.native
    
    def axis(): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ Any) = js.native
    def axis(
      `val`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ Any
    ): Slider_ = js.native
    def axis(`val`: Boolean): Slider_ = js.native
    
    def margin(): Double = js.native
    def margin(`val`: Double): Slider_ = js.native
    
    def max(): Double = js.native
    def max(`val`: Double): Slider_ = js.native
    
    def min(): Double = js.native
    def min(`val`: Double): Slider_ = js.native
    
    def on(evt: slide | slideend, callback: js.Function2[/* evt */ Any, /* val */ Any, Unit]): Slider_ = js.native
    
    def orientation(): String = js.native
    def orientation(`val`: String): Slider_ = js.native
    
    def scale(): Any = js.native
    def scale(`val`: Any): Slider_ = js.native
    
    def snap(): Boolean = js.native
    def snap(`val`: Boolean): Slider_ = js.native
    
    def step(): Double = js.native
    def step(`val`: Double): Slider_ = js.native
    
    def value(): Any = js.native
    def value(`val`: Any): Slider_ = js.native
  }
}
