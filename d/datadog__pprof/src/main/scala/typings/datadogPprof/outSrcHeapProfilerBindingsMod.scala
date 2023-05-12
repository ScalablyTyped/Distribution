package typings.datadogPprof

import typings.datadogPprof.outSrcV8TypesMod.AllocationProfileNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcHeapProfilerBindingsMod {
  
  @JSImport("@datadog/pprof/out/src/heap-profiler-bindings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllocationProfile(): AllocationProfileNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllocationProfile")().asInstanceOf[AllocationProfileNode]
  
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: js.Array[String],
    callback: Unit,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: js.Array[String],
    callback: NearHeapLimitCallback,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: Unit,
    callback: Unit,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: Unit,
    callback: NearHeapLimitCallback,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startSamplingHeapProfiler(heapIntervalBytes: Double, heapStackDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startSamplingHeapProfiler")(heapIntervalBytes.asInstanceOf[js.Any], heapStackDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopSamplingHeapProfiler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSamplingHeapProfiler")().asInstanceOf[Unit]
  
  type NearHeapLimitCallback = js.Function1[/* profile */ AllocationProfileNode, Unit]
}
