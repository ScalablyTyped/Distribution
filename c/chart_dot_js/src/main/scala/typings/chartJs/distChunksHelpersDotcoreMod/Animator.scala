package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animator extends StObject {
  
  def add(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any], items: js.Array[Animation]): Unit
  
  def has(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Boolean
  
  @JSName("listen")
  @scala.annotation.targetName("listen_complete_progress")
  def listen(
    chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any],
    event: "complete" | "progress",
    cb: js.Function1[/* event */ AnimationEvent, Unit]
  ): Unit
  
  def remove(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Boolean
  
  def running(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Boolean
  
  def start(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Unit
  
  def stop(chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Unit
}
object Animator {
  
  inline def apply(
    add: (Chart4[ChartType, DefaultDataPoint[ChartType], Any], js.Array[Animation]) => Unit,
    has: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Boolean,
    listen: (Chart4[ChartType, DefaultDataPoint[ChartType], Any], "complete" | "progress", js.Function1[/* event */ AnimationEvent, Unit]) => Unit,
    remove: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Boolean,
    running: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Boolean,
    start: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Unit,
    stop: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Unit
  ): Animator = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), has = js.Any.fromFunction1(has), listen = js.Any.fromFunction3(listen), remove = js.Any.fromFunction1(remove), running = js.Any.fromFunction1(running), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[Animator]
  }
  
  extension [Self <: Animator](x: Self) {
    
    inline def setAdd(value: (Chart4[ChartType, DefaultDataPoint[ChartType], Any], js.Array[Animation]) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setHas(value: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setListen(
      value: (Chart4[ChartType, DefaultDataPoint[ChartType], Any], "complete" | "progress", js.Function1[/* event */ AnimationEvent, Unit]) => Unit
    ): Self = StObject.set(x, "listen", js.Any.fromFunction3(value))
    
    inline def setRemove(value: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRunning(value: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Boolean): Self = StObject.set(x, "running", js.Any.fromFunction1(value))
    
    inline def setStart(value: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: Chart4[ChartType, DefaultDataPoint[ChartType], Any] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
