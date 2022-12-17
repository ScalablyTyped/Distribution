package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.AngleX
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialLinearScale[O /* <: RadialLinearScaleOptions */] extends Scale[O] {
  
  def getBasePosition(index: Double): AngleX = js.native
  
  def getDistanceFromCenterForValue(value: Double): Double = js.native
  
  def getIndexAngle(index: Double): Double = js.native
  
  def getPointLabelPosition(index: Double): ChartArea = js.native
  
  def getPointPosition(index: Double, distanceFromCenter: Double): AngleX = js.native
  
  def getPointPositionForValue(index: Double, value: Double): AngleX = js.native
  
  def getValueForDistanceFromCenter(distance: Double): Double = js.native
  
  def setCenterPoint(leftMovement: Double, rightMovement: Double, topMovement: Double, bottomMovement: Double): Unit = js.native
}
/* Inlined chart.js.chart.js.ChartComponent & {  prototype :chart.js.chart.js.RadialLinearScale<chart.js.chart.js.RadialLinearScaleOptions>, new <O extends chart.js.chart.js.RadialLinearScaleOptions = chart.js.chart.js.RadialLinearScaleOptions>(cfg : chart.js.chart.js/types/basic.AnyObject): chart.js.chart.js.RadialLinearScale<O>} */
object RadialLinearScale {
  
  @JSImport("chart.js", "RadialLinearScale")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js", "RadialLinearScale.afterRegister")
  @js.native
  def afterRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "RadialLinearScale.afterUnregister")
  @js.native
  def afterUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "RadialLinearScale.beforeRegister")
  @js.native
  def beforeRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "RadialLinearScale.beforeUnregister")
  @js.native
  def beforeUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "RadialLinearScale.defaultRoutes")
  @js.native
  def defaultRoutes: js.UndefOr[StringDictionary[String]] = js.native
  inline def defaultRoutes_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "RadialLinearScale.defaults")
  @js.native
  def defaults: js.UndefOr[AnyObject] = js.native
  inline def defaults_=(x: js.UndefOr[AnyObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "RadialLinearScale.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
