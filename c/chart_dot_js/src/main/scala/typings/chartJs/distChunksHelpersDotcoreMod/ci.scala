package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist/chunks/helpers.core", "ci")
@js.native
open class ci ()
  extends StObject
     with Animator {
  
  /* CompleteClass */
  override def add(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any], items: js.Array[Animation]): Unit = js.native
  
  /* CompleteClass */
  override def has(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Boolean = js.native
  
  /* CompleteClass */
  @JSName("listen")
  @scala.annotation.targetName("listen_complete_progress")
  override def listen(
    chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any],
    event: "complete" | "progress",
    cb: js.Function1[/* event */ AnimationEvent, Unit]
  ): Unit = js.native
  
  /* CompleteClass */
  override def remove(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Boolean = js.native
  
  /* CompleteClass */
  override def running(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Boolean = js.native
  
  /* CompleteClass */
  override def start(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Unit = js.native
  
  /* CompleteClass */
  override def stop(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Unit = js.native
}
