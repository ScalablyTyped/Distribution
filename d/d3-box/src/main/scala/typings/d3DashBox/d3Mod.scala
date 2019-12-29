package typings.d3DashBox

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("d3", JSImport.Namespace)
@js.native
object d3Mod extends js.Object {
  @js.native
  trait Box extends js.Object {
    def apply(
      sel: Selection[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
        ]
    ): Unit = js.native
    def domain(): js.Function0[js.Array[Double]] = js.native
    def domain(x: js.Array[Double]): Box = js.native
    def duration(): Double = js.native
    def duration(x: Double): Box = js.native
    def height(): Double = js.native
    def height(x: Double): Box = js.native
    def quantiles(x: js.Function1[/* d */ js.Array[_], js.Array[Double]]): Box = js.native
    def quartiles(): js.Function1[/* d */ js.Array[_], js.Array[Double]] = js.native
    def tickFormat(): js.Function1[/* n */ Double, String] = js.native
    def tickFormat(fun: js.Function1[/* n */ Double, String]): Box = js.native
    def value(): js.Function1[/* d */ js.Any, Double] = js.native
    def value(x: js.Function1[/* d */ js.Any, Double]): Box = js.native
    def whiskers(): js.Function2[/* d */ js.Array[_], /* i */ js.UndefOr[Double], js.Array[Double]] = js.native
    def whiskers(x: js.Function2[/* d */ js.Array[_], /* i */ js.UndefOr[Double], js.Array[Double]]): Box = js.native
    def width(): Double = js.native
    def width(x: Double): Box = js.native
  }
  
  def box(): Box = js.native
}

