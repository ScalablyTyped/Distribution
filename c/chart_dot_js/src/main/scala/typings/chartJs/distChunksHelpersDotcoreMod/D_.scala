package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist/chunks/helpers.core", "D")
@js.native
open class D_ protected ()
  extends StObject
     with DatasetController {
  /**
    * @param {Chart} chart
    * @param {number} datasetIndex
    */
  def this(chart: Chart, datasetIndex: Double) = this()
}
object D_ {
  
  @JSImport("chart.js/dist/chunks/helpers.core", "D")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Element type used to generate a meta data (e.g. Chart.element.PointElement).
    */
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "D.dataElementType")
  @js.native
  def dataElementType: Any = js.native
  inline def dataElementType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataElementType")(x.asInstanceOf[js.Any])
  
  /**
    * Element type used to generate a meta dataset (e.g. Chart.element.LineElement).
    */
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "D.datasetElementType")
  @js.native
  def datasetElementType: Any = js.native
  inline def datasetElementType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datasetElementType")(x.asInstanceOf[js.Any])
  
  /**
    * @type {any}
    */
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "D.defaults")
  @js.native
  def defaults: Any = js.native
  inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
}
