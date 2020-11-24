package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChart
  extends CapMixin[PieChart]
     with ColorMixin[PieChart]
     with BaseMixin[PieChart] {
  
  def cx(): Double = js.native
  def cx(t: Double): PieChart = js.native
  @JSName("cx")
  var cx_Original: IGetSet[Double, PieChart] = js.native
  
  def cy(): Double = js.native
  def cy(t: Double): PieChart = js.native
  @JSName("cy")
  var cy_Original: IGetSet[Double, PieChart] = js.native
  
  def drawPaths(): Boolean = js.native
  def drawPaths(t: Boolean): PieChart = js.native
  @JSName("drawPaths")
  var drawPaths_Original: IGetSet[Boolean, PieChart] = js.native
  
  def emptyTitle(): String = js.native
  def emptyTitle(t: String): PieChart = js.native
  @JSName("emptyTitle")
  var emptyTitle_Original: IGetSet[String, PieChart] = js.native
  
  def externalLabels(): Double = js.native
  def externalLabels(t: Double): PieChart = js.native
  @JSName("externalLabels")
  var externalLabels_Original: IGetSet[Double, PieChart] = js.native
  
  def externalRadiusPadding(): Double = js.native
  def externalRadiusPadding(t: Double): PieChart = js.native
  @JSName("externalRadiusPadding")
  var externalRadiusPadding_Original: IGetSet[Double, PieChart] = js.native
  
  def innerRadius(): Double = js.native
  def innerRadius(t: Double): PieChart = js.native
  @JSName("innerRadius")
  var innerRadius_Original: IGetSet[Double, PieChart] = js.native
  
  def minAngleForLabel(): Double = js.native
  def minAngleForLabel(t: Double): PieChart = js.native
  @JSName("minAngleForLabel")
  var minAngleForLabel_Original: IGetSet[Double, PieChart] = js.native
  
  def radius(): Double = js.native
  def radius(t: Double): PieChart = js.native
  @JSName("radius")
  var radius_Original: IGetSet[Double, PieChart] = js.native
  
  def slicesCap(): Double = js.native
  def slicesCap(t: Double): PieChart = js.native
  @JSName("slicesCap")
  var slicesCap_Original: IGetSet[Double, PieChart] = js.native
}
