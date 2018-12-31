package typings
package d3DashBoxLib.d3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends js.Object {
  def apply(
    sel: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ): scala.Unit = js.native
  def domain(): js.Function0[js.Array[scala.Double]] = js.native
  def domain(x: js.Array[scala.Double]): Box = js.native
  def duration(): scala.Double = js.native
  def duration(x: scala.Double): Box = js.native
  def height(): scala.Double = js.native
  def height(x: scala.Double): Box = js.native
  def quantiles(x: js.Function1[/* d */ js.Array[_], js.Array[scala.Double]]): Box = js.native
  def quartiles(): js.Function1[/* d */ js.Array[_], js.Array[scala.Double]] = js.native
  def tickFormat(): js.Function1[/* n */ scala.Double, java.lang.String] = js.native
  def tickFormat(fun: js.Function1[/* n */ scala.Double, java.lang.String]): Box = js.native
  def value(): js.Function1[/* d */ js.Any, scala.Double] = js.native
  def value(x: js.Function1[/* d */ js.Any, scala.Double]): Box = js.native
  def whiskers(): js.Function2[/* d */ js.Array[_], /* i */ js.UndefOr[scala.Double], js.Array[scala.Double]] = js.native
  def whiskers(x: js.Function2[/* d */ js.Array[_], /* i */ js.UndefOr[scala.Double], js.Array[scala.Double]]): Box = js.native
  def width(): scala.Double = js.native
  def width(x: scala.Double): Box = js.native
}

