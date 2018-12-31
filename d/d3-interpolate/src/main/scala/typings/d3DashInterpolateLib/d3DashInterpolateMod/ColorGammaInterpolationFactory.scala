package typings
package d3DashInterpolateLib.d3DashInterpolateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorGammaInterpolationFactory
  extends js.Function {
  def apply(
    a: d3DashColorLib.d3DashColorMod.ColorCommonInstance,
    b: d3DashColorLib.d3DashColorMod.ColorCommonInstance
  ): js.Function1[/* t */ scala.Double, java.lang.String] = js.native
  def apply(a: d3DashColorLib.d3DashColorMod.ColorCommonInstance, b: java.lang.String): js.Function1[/* t */ scala.Double, java.lang.String] = js.native
  def apply(a: java.lang.String, b: d3DashColorLib.d3DashColorMod.ColorCommonInstance): js.Function1[/* t */ scala.Double, java.lang.String] = js.native
  def apply(a: java.lang.String, b: java.lang.String): js.Function1[/* t */ scala.Double, java.lang.String] = js.native
  /**
    * Returns a new interpolator factory of the same type using the specified *gamma*.
    * For example, to interpolate from purple to orange with a gamma of 2.2 in RGB space: `d3.interpolateRgb.gamma(2.2)("purple", "orange")`.
    * See Eric Brasseur’s article, [Gamma error in picture scaling](https://web.archive.org/web/20160112115812/http://www.4p8.com/eric.brasseur/gamma.html), for more on gamma correction.
    */
  def gamma(g: scala.Double): ColorGammaInterpolationFactory = js.native
}

