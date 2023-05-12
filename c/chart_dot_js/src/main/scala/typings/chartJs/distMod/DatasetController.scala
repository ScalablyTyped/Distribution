package typings.chartJs.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist", "DatasetController")
@js.native
open class DatasetController protected ()
  extends typings.chartJs.distCoreMod.DatasetController {
  /**
    * @param {Chart} chart
    * @param {number} datasetIndex
    */
  def this(chart: typings.chartJs.distCoreCoreDotdatasetControllerMod.Chart, datasetIndex: Double) = this()
}
/* static members */
object DatasetController {
  
  @JSImport("chart.js/dist", "DatasetController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Element type used to generate a meta data (e.g. Chart.element.PointElement).
    */
  @JSImport("chart.js/dist", "DatasetController.dataElementType")
  @js.native
  def dataElementType: Any = js.native
  inline def dataElementType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataElementType")(x.asInstanceOf[js.Any])
  
  /**
    * Element type used to generate a meta dataset (e.g. Chart.element.LineElement).
    */
  @JSImport("chart.js/dist", "DatasetController.datasetElementType")
  @js.native
  def datasetElementType: Any = js.native
  inline def datasetElementType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datasetElementType")(x.asInstanceOf[js.Any])
  
  /**
    * @type {any}
    */
  @JSImport("chart.js/dist", "DatasetController.defaults")
  @js.native
  def defaults: Any = js.native
  inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
}
