package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.basicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeScale[O /* <: TimeScaleOptions */] extends Scale[O] {
  
  def getDataTimestamps(): js.Array[Double] = js.native
  
  def getLabelTimestamps(): js.Array[String] = js.native
  
  def normalize(values: js.Array[Double]): js.Array[Double] = js.native
}
/* Inlined chart.js.chart.js.ChartComponent & {  prototype :chart.js.chart.js.TimeScale<chart.js.chart.js.TimeScaleOptions>, new <O extends chart.js.chart.js.TimeScaleOptions = chart.js.chart.js.TimeScaleOptions>(cfg : chart.js.chart.js/types/basic.AnyObject): chart.js.chart.js.TimeScale<O>} */
object TimeScale {
  
  @JSImport("chart.js", "TimeScale")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js", "TimeScale.afterRegister")
  @js.native
  def afterRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "TimeScale.afterUnregister")
  @js.native
  def afterUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "TimeScale.beforeRegister")
  @js.native
  def beforeRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "TimeScale.beforeUnregister")
  @js.native
  def beforeUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "TimeScale.defaultRoutes")
  @js.native
  def defaultRoutes: js.UndefOr[StringDictionary[String]] = js.native
  inline def defaultRoutes_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "TimeScale.defaults")
  @js.native
  def defaults: js.UndefOr[AnyObject] = js.native
  inline def defaults_=(x: js.UndefOr[AnyObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "TimeScale.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
