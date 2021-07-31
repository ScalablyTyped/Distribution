package typings.d3Box

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("d3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def box(): Box_ = ^.asInstanceOf[js.Dynamic].applyDynamic("box")().asInstanceOf[Box_]
  
  @js.native
  trait Box_ extends StObject {
    
    def apply(
      sel: Selection_[
          js.Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
        ]
    ): Unit = js.native
    
    def domain(): js.Function0[js.Array[Double]] = js.native
    def domain(x: js.Array[Double]): Box_ = js.native
    
    def duration(): Double = js.native
    def duration(x: Double): Box_ = js.native
    
    def height(): Double = js.native
    def height(x: Double): Box_ = js.native
    
    def quantiles(x: js.Function1[/* d */ js.Array[js.Any], js.Array[Double]]): Box_ = js.native
    
    def quartiles(): js.Function1[/* d */ js.Array[js.Any], js.Array[Double]] = js.native
    
    def tickFormat(): js.Function1[/* n */ Double, String] = js.native
    def tickFormat(fun: js.Function1[/* n */ Double, String]): Box_ = js.native
    
    def value(): js.Function1[/* d */ js.Any, Double] = js.native
    def value(x: js.Function1[/* d */ js.Any, Double]): Box_ = js.native
    
    def whiskers(): js.Function2[/* d */ js.Array[js.Any], /* i */ js.UndefOr[Double], js.Array[Double]] = js.native
    def whiskers(x: js.Function2[/* d */ js.Array[js.Any], /* i */ js.UndefOr[Double], js.Array[Double]]): Box_ = js.native
    
    def width(): Double = js.native
    def width(x: Double): Box_ = js.native
  }
}
