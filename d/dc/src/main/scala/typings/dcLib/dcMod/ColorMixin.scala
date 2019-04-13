package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMixin[T] extends js.Object {
  @JSName("colorAccessor")
  var colorAccessor_Original: IGetSet[Accessor[_, scala.Double], T] = js.native
  @JSName("colorCalculator")
  var colorCalculator_Original: IGetSet[Accessor[_, java.lang.String], T] = js.native
  @JSName("colorDomain")
  var colorDomain_Original: IGetSet[js.Array[_], T] = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.colorMixin.html
  @JSName("colors")
  var colors_Original: IGetSet[
    js.Array[java.lang.String] | (Scale[java.lang.String | d3DashColorLib.d3DashColorMod.Color]) | java.lang.String, 
    T
  ] = js.native
  def calculateColorDomain(): scala.Unit = js.native
  def colorAccessor(): Accessor[_, scala.Double] = js.native
  def colorAccessor(t: Accessor[_, scala.Double]): Accessor[_, scala.Double] = js.native
  def colorCalculator(): Accessor[_, java.lang.String] = js.native
  def colorCalculator(t: Accessor[_, java.lang.String]): Accessor[_, java.lang.String] = js.native
  def colorDomain(): js.Array[_] = js.native
  def colorDomain(t: js.Array[_]): js.Array[_] = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.colorMixin.html
  def colors(): js.Array[java.lang.String] | (Scale[java.lang.String | d3DashColorLib.d3DashColorMod.Color]) | java.lang.String = js.native
  def colors(t: Scale[java.lang.String | d3DashColorLib.d3DashColorMod.Color]): js.Array[java.lang.String] | (Scale[java.lang.String | d3DashColorLib.d3DashColorMod.Color]) | java.lang.String = js.native
  def colors(t: java.lang.String): js.Array[java.lang.String] | (Scale[java.lang.String | d3DashColorLib.d3DashColorMod.Color]) | java.lang.String = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.colorMixin.html
  def colors(t: js.Array[java.lang.String]): js.Array[java.lang.String] | (Scale[java.lang.String | d3DashColorLib.d3DashColorMod.Color]) | java.lang.String = js.native
  def getColor(datum: js.Any): java.lang.String = js.native
  def getColor(datum: js.Any, index: scala.Double): java.lang.String = js.native
  def linearColors(r: js.Array[java.lang.String]): T = js.native
  def ordinalColors(r: js.Array[java.lang.String]): T = js.native
}

