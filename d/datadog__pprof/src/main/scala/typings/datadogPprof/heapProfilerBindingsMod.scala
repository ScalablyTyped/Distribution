package typings.datadogPprof

import typings.datadogPprof.v8TypesMod.AllocationProfileNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heapProfilerBindingsMod {
  
  @JSImport("@datadog/pprof/out/src/heap-profiler-bindings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllocationProfile(): AllocationProfileNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllocationProfile")().asInstanceOf[AllocationProfileNode]
  
  inline def startSamplingHeapProfiler(heapIntervalBytes: Double, heapStackDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startSamplingHeapProfiler")(heapIntervalBytes.asInstanceOf[js.Any], heapStackDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopSamplingHeapProfiler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSamplingHeapProfiler")().asInstanceOf[Unit]
}
