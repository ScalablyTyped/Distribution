package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoughnutController extends DatasetController[
      ChartType, 
      default[AnyObject, AnyObject], 
      default[AnyObject, AnyObject], 
      ParsedDataType[ChartType]
    ] {
  
  def calculateCircumference(value: Double): Double = js.native
  
  def calculateTotal(): Double = js.native
  
  val innerRadius: Double = js.native
  
  val offsetX: Double = js.native
  
  val offsetY: Double = js.native
  
  val outerRadius: Double = js.native
}
/* Inlined chart.js.chart.js/dist/types/index.ChartComponent & {  prototype :chart.js.chart.js/dist/types/index.DoughnutController, new (chart : chart.js.chart.js/dist/types/index.Chart<chart.js.chart.js/dist/types/index.ChartType, chart.js.chart.js/dist/types/index.DefaultDataPoint<chart.js.chart.js/dist/types/index.ChartType>, unknown>, datasetIndex : number): chart.js.chart.js/dist/types/index.DoughnutController} */
object DoughnutController {
  
  @JSImport("chart.js/dist/types/index", "DoughnutController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist/types/index", "DoughnutController.afterRegister")
  @js.native
  def afterRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "DoughnutController.afterUnregister")
  @js.native
  def afterUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "DoughnutController.beforeRegister")
  @js.native
  def beforeRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "DoughnutController.beforeUnregister")
  @js.native
  def beforeUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "DoughnutController.defaultRoutes")
  @js.native
  def defaultRoutes: js.UndefOr[StringDictionary[String]] = js.native
  inline def defaultRoutes_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "DoughnutController.defaults")
  @js.native
  def defaults: js.UndefOr[AnyObject] = js.native
  inline def defaults_=(x: js.UndefOr[AnyObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "DoughnutController.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
