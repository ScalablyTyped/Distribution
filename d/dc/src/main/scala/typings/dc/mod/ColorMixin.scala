package typings.dc.mod

import typings.d3Color.mod.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorMixin[T] extends StObject {
  
  def calculateColorDomain(): Unit = js.native
  
  def colorAccessor(): Accessor[Any, Double] = js.native
  def colorAccessor(t: Accessor[Any, Double]): T = js.native
  @JSName("colorAccessor")
  var colorAccessor_Original: IGetSet[Accessor[Any, Double], T] = js.native
  
  def colorCalculator(): Accessor[Any, String] = js.native
  def colorCalculator(t: Accessor[Any, String]): T = js.native
  @JSName("colorCalculator")
  var colorCalculator_Original: IGetSet[Accessor[Any, String], T] = js.native
  
  def colorDomain(): js.Array[Any] = js.native
  def colorDomain(t: js.Array[Any]): T = js.native
  @JSName("colorDomain")
  var colorDomain_Original: IGetSet[js.Array[Any], T] = js.native
  
  // http://dc-js.github.io/dc.js/docs/html/dc.colorMixin.html
  def colors(): js.Array[String] | (Scale[String | Color_]) | String = js.native
  def colors(t: String): T = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.colorMixin.html
  def colors(t: js.Array[String]): T = js.native
  def colors(t: Scale[String | Color_]): T = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.colorMixin.html
  @JSName("colors")
  var colors_Original: IGetSet[js.Array[String] | (Scale[String | Color_]) | String, T] = js.native
  
  def getColor(datum: Any): String = js.native
  def getColor(datum: Any, index: Double): String = js.native
  
  def linearColors(r: js.Array[String]): T = js.native
  
  def ordinalColors(r: js.Array[String]): T = js.native
}
