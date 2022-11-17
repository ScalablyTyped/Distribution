package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object I_ {
  
  @JSImport("chart.js/dist/chunks/helpers.core", "I")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to select candidate elements for interaction
    */
  inline def evaluateInteractionItems(
    chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any],
    axis: InteractionAxis,
    position: Point1,
    handler: js.Function3[
      /* element */ (Element[AnyObject, AnyObject]) & VisualElement, 
      /* datasetIndex */ Double, 
      /* index */ Double, 
      Unit
    ]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateInteractionItems")(chart.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], position.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  inline def evaluateInteractionItems(
    chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any],
    axis: InteractionAxis,
    position: Point1,
    handler: js.Function3[
      /* element */ (Element[AnyObject, AnyObject]) & VisualElement, 
      /* datasetIndex */ Double, 
      /* index */ Double, 
      Unit
    ],
    intersect: Boolean
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateInteractionItems")(chart.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], position.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], intersect.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  @JSImport("chart.js/dist/chunks/helpers.core", "I.modes")
  @js.native
  def modes: InteractionModeMap = js.native
  inline def modes_=(x: InteractionModeMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
}
