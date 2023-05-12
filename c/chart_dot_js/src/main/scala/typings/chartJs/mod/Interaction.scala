package typings.chartJs.mod

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.Point
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.distTypesIndexMod.InteractionAxis
import typings.chartJs.distTypesIndexMod.InteractionItem
import typings.chartJs.distTypesIndexMod.InteractionModeMap
import typings.chartJs.distTypesIndexMod.VisualElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interaction {
  
  @JSImport("chart.js", "Interaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to select candidate elements for interaction
    */
  inline def evaluateInteractionItems(
    chart: typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any],
    axis: InteractionAxis,
    position: Point,
    handler: js.Function3[
      /* element */ (default[AnyObject, AnyObject]) & VisualElement, 
      /* datasetIndex */ Double, 
      /* index */ Double, 
      Unit
    ]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateInteractionItems")(chart.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], position.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  inline def evaluateInteractionItems(
    chart: typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any],
    axis: InteractionAxis,
    position: Point,
    handler: js.Function3[
      /* element */ (default[AnyObject, AnyObject]) & VisualElement, 
      /* datasetIndex */ Double, 
      /* index */ Double, 
      Unit
    ],
    intersect: Boolean
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateInteractionItems")(chart.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], position.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], intersect.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  @JSImport("chart.js", "Interaction.modes")
  @js.native
  def modes: InteractionModeMap = js.native
  inline def modes_=(x: InteractionModeMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
}
